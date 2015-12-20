package spring.first.data;

import java.util.ArrayList;
import java.util.List;

import spring.first.model.Address;
import spring.first.model.User;

public class UserService {
	private static List<User> users;
	public UserService()
	{
		users=new ArrayList<User>();
		loadMockedUsers();
	}
	
	public List<User> getMockedUsers()
	{
		return users;
	}
	
	private void loadMockedUsers()
	{
		User user1=new User();
		user1.setId("U0001");
		user1.setFirstName("Laksh");
		user1.setLastName("Jonsan");
		user1.setPreferredContactMethod(new String[]{"phone","email"});
		user1.setSex("male");
		Address address=new Address();
		address.setNo(1011);
		address.setCity("Collombo");
		address.setCountry("Sri lanka");
		user1.setAddress(address);
		users.add(user1);
		
		User user2=new User();
		user2.setId("U0002");
		user2.setFirstName("Ashly");
		user2.setLastName("Jenuri");
		user2.setPreferredContactMethod(new String[]{"phone"});
		user2.setSex("female");
		Address address2=new Address();
		address2.setNo(225);
		address2.setCity("Gampaha");
		address2.setCountry("Sri lanka");
		user2.setAddress(address2);
		users.add(user2);
	}
	
	public User saveUser(User user)
	{
		users.add(user);
		return findUser(user.getId());
	}
	
	public User findUser(String id)
	{
		for (User user : users) {
			if(user.getId().equalsIgnoreCase(id))
			{
				return user;
			}
		}
		return null;
	}
}
