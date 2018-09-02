package hw08;
/*This program creates the object Wrestler using the String move and the boolean face, as well as age and name inherited from SimplePerson
 * @author Colette Pujol
 * @version 1.0 27 March 2015
 */
public class Wrestler extends SimplePerson { //creates object wrestler using String move and boolean face
	private String move;
	private boolean face;
	public Wrestler(){ //default constructor
		super();
		move="no move yet";
		face=false;
	}
	public Wrestler(int age, String name, String move, boolean face){ //constructs Wrestler using name and age inherited from SimplePerson and the String move and the boolean face
		super(name,age);
		this.move=move;
		this.face=face;
	}
	public String getMove(){ //gets the move 
		return move;
	}
	public void setMove(String move){ //sets the move
		this.move=move;
	}
	public boolean getFace(){ //gets the value of face
		return face;
	}
	public void setFace(boolean face){ //sets the value of face
		this.face=face;
	}
	public boolean equals(Wrestler that){ //checks if 2 Wrestlers are  equal based on their names and ages
		return getName().equals(that.getName()) && getAge()==that.getAge();
	}
	@Override
	public String toString(){ //overrides the toString method and returns the Wrestler's name, age, finishing move, and whether or not he is a face in one String
		return "Name: " +this.getName() + "\nAge: " +this.getAge() + "\nFinishing Move: " + this.getMove()+ "\nIs a face? " + face; 
	}
}
