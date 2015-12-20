package spring.first.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.first.data.UserService;
import spring.first.data.validator.UserValidator;
import spring.first.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/userHandling")
	public String home()
	{
		return "userMain";
	}
	
	@RequestMapping("/addUser")
	public String newUser(Model model)
	{
		model.addAttribute("user", new User());
		List<String> prefContctMethods=new ArrayList<String>();
		prefContctMethods.add("E-mail");
		prefContctMethods.add("Call");
		model.addAttribute("prefContct", prefContctMethods);
		List<String> sexType=new ArrayList<String>();
		sexType.add("Male");
		sexType.add("Female");
		model.addAttribute("sexType", sexType);
		return "newUser";
	}
	
	@RequestMapping(value="saveUser", method=RequestMethod.POST )
	public String saveUser(@Valid @ModelAttribute User user,Errors errors, Model model)
	{
		System.out.println(user);
		if(errors.hasErrors())
		{
			List<String> prefContctMethods=new ArrayList<String>();
			prefContctMethods.add("E-mail");
			prefContctMethods.add("Call");
			model.addAttribute("prefContct", prefContctMethods);
			List<String> sexType=new ArrayList<String>();
			sexType.add("Male");
			sexType.add("Female");
			model.addAttribute("sexType", sexType);
			return "newUser";
		}		
		userService.saveUser(user);
		model.addAttribute("users", userService.getMockedUsers());
		return "allUsers";
	}
	
	@RequestMapping("/allUsers")
	public String allUsers( Model model)
	{
		model.addAttribute("users", userService.getMockedUsers());
		return "allUsers";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.addValidators(new UserValidator());
	}
}
