package spring.first.data.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import spring.first.model.User;

public class UserValidator implements Validator {

	public boolean supports(Class<?> className) {

		if(className.equals(User.class))
		{
			return true;
		}
		return false;
	}

	public void validate(Object obj, Errors errors) {
		if(obj instanceof User)
		{
			User user=(User)obj;
			if(user.getId().length()<3)
			{
				errors.rejectValue("id", "user.id", "Id should be minimum 3 charactors");				
			}
			
			if(user.getFirstName().length()<1)
			{
				errors.rejectValue("firstName", "user.firstName", "First Name can not be blank");
			}
		}
	}

}
