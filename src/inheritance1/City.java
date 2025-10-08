package inheritance1;

public class City extends State
{
	private String cityName;
	private int pincode;
	
	//u have extended from parent class (State) i.e, source-generate constructor using superclass and manually add the data member of City class....
		public City(String countryName, String aadharNo, String state, String language,String cityName,int pincode)
		{
			super(countryName, aadharNo, state, language);
			this.cityName=cityName;
			this.pincode=pincode;

		}
	
	//source-generate getter and setter...
	public String getCityName() 
	{
		return cityName;
	}

	public void setCityName(String cityName) 
	{
		this.cityName = cityName;
	}

	public int getPincode() 
	{
		return pincode;
	}

	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}

	
}
