package Inheritance; //parent class.....

public class Citizen {

	private String name;
	private String aadharNo;
	private String address;
	private long phno;
	
	public Citizen()
	{
		System.out.println("I am a default constructor");
	}
	public Citizen(String name, String aadharNo, String address, long phno) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno
				+ ", getName()=" + getName() + ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress()
				+ ", getPhno()=" + getPhno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
		
	

}
