package hw08;
/*This program creates the object Doctor with the parameters specialty and fee as well as the parameters name and age inherited from the SimplePerson class
 * @author Colette Pujol
 * @version 1.0 27 March 2015
 */
public class Doctor extends SimplePerson { //creates the object doctor which inherits age and name from SimplePerson and also has the double fee and the String specialty
	private String specialty;
	private double fee;
	public Doctor(){ //default constructor
		super();
		specialty="no specialty yet";
		fee=0;
	}
	public Doctor(String name, int age, String specialty, int fee){ //constructs Doctor using name, age, specialty, and fee
		this.specialty=specialty;
		this.fee=fee;
	}
	public String getSpecialty(){ //gets specialty
		return specialty;
	}
	public void setSpecialty(String specialty){ //sets specialty
		this.specialty=specialty;
	}
	public double getFee(){ //gets the value of the fee
		return fee;
	}
	public void setFee(double fee){ //checks that the fee is not negative. If it is the program returns an error message and the fee is set to 0. Otherwise it sets the fee to the given value
		if(fee<0){
			System.out.println("The doctor's fee cannot be negative");
		}else{
			this.fee=fee;
		}
	}
	public boolean equals(Doctor that){ //checks if two Doctor's are equal based on age and name
		return getName().equals(that.getName()) && getAge()==that.getAge();
	}
	@Override
	public String toString(){ //returns the Doctor's name, age, specialty and fee as one String
		return "Name: " + this.getName() + "\nAge: " + this.getAge() + "\nSpecialty: " + this.getSpecialty() + "\nFee: $" +this.getFee(); 
	}
	
}
