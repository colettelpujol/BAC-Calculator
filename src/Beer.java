/*This program defines the class Beer and calculates the amount of beers necessary to intoxicate a person based on their weight
 * @author Colette Pujol
 * @version 1.0 14 March 2015
 */
public class Beer {
	String name;
	double alcoholContent;
	Beer(){
		name="Pabst Blue Hipster";
		alcoholContent=0.05;
	}
	Beer(String name, double alcoholContent){
		this.name=name;
		this.alcoholContent=alcoholContent;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getAlcoholContent(){
		return alcoholContent;
	}
	public void setAlcoholContent(double alcoholContent){
		this.alcoholContent=alcoholContent;
	}
	/**
	 * Calculates the number of beers needed to intoxicate someone
	 * This uses the alcohol content of Beer b and the persons weight to calculate how many of Beer b would be necessary to intoxicate them
	 * @param b is a Beer
	 * @param weight is a double
	 */
	public static void intoxicatedCal(Beer b, double weight){
		double drinksRequired;
		drinksRequired=((0.08+0.015)*weight)/(12*7.5*b.alcoholContent);
		System.out.println("It would take " + drinksRequired + " " + b.name +  " to become intoxicated.");
		System.out.println("Later tater");
	}
}

