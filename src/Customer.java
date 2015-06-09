//Arpita 6/4/2015
public class Customer extends CustomerIO {

	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Customer()
	{
		
		this.name = getName();
		this.state =getState();
		this.city =getCity();
		this.address =getAddress();
		this.zipCode =getZipCode();
	}
	@Override
	public String toString()
	{
		String message = this.name +this.state +this.city+this.address+this.zipCode;
		return message;
	}
}
