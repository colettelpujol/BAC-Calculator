package hw08;
/*This program constructs the object SimplePerson which has a name and an age
 * @author Colette Pujol
 * @version 1.0 27 March 2015
 */
public class SimplePerson { //creates the object simple person with the parameters name and age
	private String name;
	private int age;
	public SimplePerson(){ //default constructor
		name="no name yet";
		age=0;
	}
	public SimplePerson(String name, int age){ //constructor using the parameters integer age and String name
		this.name=name;
		this.age=age;
	}
	public int getAge(){ //gets the value of age
		return age;
	}
	public void setAge(int age){ //sets the value of age. If the age is negative it returns an error message and sets the age to 0
		if(age<0){
			System.out.println("This is not a valid age");
		}else{
			this.age=age;
		}
	}
	public String getName(){ //gets the name
		return name;
	}
	public void setName(String name){ //sets the name
		this.name=name;
	}
}
