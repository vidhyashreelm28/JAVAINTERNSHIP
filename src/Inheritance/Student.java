package Inheritance;

public class Student extends Citizen
{
	private int rollNo;
	private String collegeName;
	
	public Student() //source-generate constructor using superclass.......
	{
		super();
	}
	
	public Student(String name, String aadharNo, String address, long phno,int rollNo,String collegeName)   //u have extended from parent class (Citizen) and manually add the data member of Student class
	{
		super(name, aadharNo, address, phno);
		this.collegeName=collegeName;
		this.rollNo=rollNo;
	}
	public int getRollNo() 
	{
		return rollNo;
	}
	//source-generate getter and setter
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getRollNo()=" + getRollNo()
				+ ", getCollegeName()=" + getCollegeName() + ", toString()=" + super.toString() + ", getName()="
				+ getName() + ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhno()="
				+ getPhno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
