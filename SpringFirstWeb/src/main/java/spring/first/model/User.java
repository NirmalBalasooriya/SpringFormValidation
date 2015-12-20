package spring.first.model;

import java.util.Arrays;
import java.util.List;

public class User {
	private String id;
	private String firstName;
	private String lastName;
	private Address address;
	private String[] preferredContactMethod;
	private String sex;
	private List<String> contactNumbers;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String[] getPreferredContactMethod() {
		return preferredContactMethod;
	}
	public void setPreferredContactMethod(String[] preferredContactMethod) {
		this.preferredContactMethod = preferredContactMethod;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getContactNumbers() {
		return contactNumbers;
	}
	public void setContactNumbers(List<String> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", address=" + address
				+ ", preferredContactMethod="
				+ Arrays.toString(preferredContactMethod) + ", sex=" + sex
				+ ", contactNumbers=" + contactNumbers + "]";
	}
}
