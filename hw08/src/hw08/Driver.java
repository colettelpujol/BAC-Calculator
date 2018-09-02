/*This program tests the setters, getters, constructors, and toString methods from the classes Doctor, Wrestler, and Lawyer which all extend SimplePerson
 * @author Colette Pujol
 * @version 1.0 27 March 2015
 */
package hw08;

public class Driver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1=new Doctor();
		System.out.println("Testing the Doctor class");
		System.out.println("Printing Doctor's information");
		System.out.println(d1.toString());
		System.out.println("");
		System.out.println("Changing Doctor's name, specialty, and fee via mutators");
		d1.setName("Matt Smith");
		d1.setAge(1196);
		d1.setSpecialty("Time Lord");
		d1.setFee(4.95);
		System.out.println(d1.toString());
		System.out.println("");
		System.out.println("Creating Doctor via parameterized construction");
		Doctor d2=new Doctor("Albert W. Wiley", 62, "Robotics", 1987);
		System.out.println(d2.toString());
		System.out.println("");
		System.out.println("Testing if the two Doctors are equal");
		System.out.println(d1.equals(d2));
		System.out.println("");
		Lawyer lawyer1=new Lawyer();
		System.out.println("Testing the Lawyer class");
		System.out.println("Printing Lawyer's information");
		System.out.println(lawyer1.toString());
		System.out.println("");
		System.out.println("Changing Lawyer's name, specialty, and fee via mutators");
		lawyer1.setName("Saul Goodman");
		lawyer1.setAge(44);
		lawyer1.setType("Criminal Lawyer");
		lawyer1.setDate("4/6/2015");
		System.out.println(lawyer1.toString());
		System.out.println("");
		System.out.println("Creating Lawyer via parameterized construction");
		Lawyer lawyer2=new Lawyer("Saul Goodman", 44, "Criminal Lawyer", "4/6/2015");
		System.out.println(lawyer2.toString());
		System.out.println("");
		System.out.println("Testing if the two Lawyers are equal");
		System.out.println(lawyer1.equals(lawyer2));
		System.out.println("");
		Wrestler wrestler1=new Wrestler();
		System.out.println("Testing the Wrestler class");
		System.out.println("Printing Wrestler's information");
		System.out.println(wrestler1.toString());
		System.out.println("");
		System.out.println("Changing Wrestler's name, specialty, and fee via mutators");
		wrestler1.setName("Daniel Brian");
		wrestler1.setAge(33);
		wrestler1.setMove("Yes Lock");
		wrestler1.setFace(true);
		System.out.println(wrestler1.toString());
		System.out.println("");
		System.out.println("Creating Wrestler via parameterized construction");
		Wrestler wrestler2=new Wrestler(27, "Hulk Hogan","Super Kick", false);
		System.out.println(wrestler2.toString());
		System.out.println("");
		System.out.println("Testing if the two Wrestlers are equal");
		System.out.println(wrestler1.equals(wrestler2));
		System.out.println("");
		System.out.println("Done!");
	}
	

}
