package inheritance1;

public class State extends Country 
{
	private String state;
	private String language;
	
	//u have extended from parent class (Country) i.e, source-generate constructor using superclass and manually add the data member of State class.......
	public State(String countryName, String aadharNo,String state,String language) 
	{
		super(countryName, aadharNo);
		this.state=state;
		this.language=language;

	}
	
	//source-generate getter and setter
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getLanguage() 
	{
		return language;
	}
	public void setLanguage(String language) 
	{
		this.language = language;
	}
}
