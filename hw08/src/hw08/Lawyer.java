package hw08;
/*This program constructs the object Lawyer with the parameters type and date, as well as name and age inherited from the class SimplePerson
 * @author Colette Pujol
 * @version 1.0 27 March 2015 
 */
public class Lawyer extends SimplePerson{ //creates the object Lawyer which inherits name and age from simple person and also has a String type and a String date
	private String type;
	private String date;
	public Lawyer(){ //default constructor
		super();
		type="no type yet";
		date="no date yet";
	}
	public Lawyer(String name, int age, String type, String date){ //constructor using parameters age and name from simple person and Strings type and date 
		super(name, age);
		this.type=type;
		this.date=date;
	}
	public String getType(){ //gets the Lawyer's type
		return type;
	}
	public void setType(String type){ //sets the Lawyer's type
		this.type=type;
	}
	public String getDate(){ //gets the lawyer's court date
		return date;
	}
	public void setDate(String date){ //sets the lawyers court date
		this.date=date;
	}
	public boolean equals(Lawyer that){ //checks whether 2 lawyers are equal or not based on their name and age
		return getName().equals(that.getName()) && getAge()==that.getAge();
	}
	@Override
	public String toString(){
		return "Name: " + this.getName()+ "\nAge: " + this.getAge()+"\nType: "+ this.getType()+ "\nCourt Date: " + this.getDate(); //Overrides the toString method and gives the lawyer's name, age, type, and court date as one String
	}
}
