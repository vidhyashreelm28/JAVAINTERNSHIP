package PACKAGE2;

public class Person {

	private String personName;
	protected int personAge;
    String personCity;
    public void setPersonName(String personName)
    {
	  this.personName= personName;
    
  }
 
	public String getPersonName() {
		return personName;
		
	}
	
	
	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	public void display() {
		System.out.println(personName + personAge + personCity);
	}
}



