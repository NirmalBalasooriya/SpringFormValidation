package spring.first.model;

public class Address {
	private int no;
	private String Streat;
	private String city;
	private String area;
	private String country;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStreat() {
		return Streat;
	}
	public void setStreat(String streat) {
		Streat = streat;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [no=" + no + ", Streat=" + Streat + ", city=" + city
				+ ", area=" + area + ", country=" + country + "]";
	}

}
