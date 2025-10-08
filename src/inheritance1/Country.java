package inheritance1;

public class Country 
{
	private String countryName;
	private String aadharNo;
	//source-generate getter and setter...
	public String getCountryName() 
	{
		return countryName;
	}
	public void setCountryName(String countryName) 
	{
		this.countryName = countryName;
	}
	public String getAadharNo() 
	{
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) 
	{
		this.aadharNo = aadharNo;
	}
	//source-generate toString
	@Override
	public String toString() 
	{
		return "Country [countryName=" + countryName + ", aadharNo=" + aadharNo + ", getCountryName()="
				+ getCountryName() + ", getAadharNo()=" + getAadharNo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	//source-generate constructor from fields
	public Country(String countryName, String aadharNo) {
		super();
		this.countryName = countryName;
		this.aadharNo = aadharNo;
	}

	

}
