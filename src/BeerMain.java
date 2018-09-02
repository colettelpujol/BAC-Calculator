/*This program uses the class Beer and asks the user to create their own objects Beer by inputing the name and alcohol content of the Beer.
 * @author Colette Pujol
 * @version 1.0 14 March 2015
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeerMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		double alcoholContent;
		double weight;
		boolean flag=false;
		Beer b1=new Beer(); //declares 2 new objects of the class Beer
		Beer b2=new Beer();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Let's party! Responsibly...");
		System.out.println("What is the name of the first beer?");
		b1.setName(br.readLine());
		System.out.println("What's the alcohol content?");
		do{
			alcoholContent=Double.parseDouble(br.readLine());
			if(alcoholContent>1 || alcoholContent<0){ //If the alcohol content is not between 0 and 1 the program returns an error
				System.out.println("Alcohol content must be greater than 0 and less than 1");
				flag=false;
				
			}else{ //if the alcohol content is between 0 and 1 the double alcoholContent in the class Beer is set to that value
				if(alcoholContent>0 && alcoholContent<1){
					b1.setAlcoholContent(alcoholContent);
					flag=true;
				}
			}
		}
		while(flag!=true);
		System.out.println("What's the name of the second beer?");
		b2.setName(br.readLine());
		System.out.println("What's the alcohol content?");
		do{
			alcoholContent=Double.parseDouble(br.readLine()); 
			if(alcoholContent>1 || alcoholContent<0){ //If the alcohol content is not between 0 and 1 the program returns an error
				System.out.println("Alcohol content must be greater than 0 and less than 1");
				flag=false;
			}else{ //if the alcohol content is between 0 and 1 the double alcoholContent in the class Beer is set to that value
				if(alcoholContent<1 && alcoholContent>0){ 
					b2.setAlcoholContent(alcoholContent);
					flag=true;
				}
			}
		}
		while(flag!=true);
		
		System.out.println("What's the weight of the person consuming said beverages?");
		weight=Double.parseDouble(br.readLine());
		Beer.intoxicatedCal(b1, weight); //calls the intoxicatedCal method in the Beer class for both Beers entered and the weight of the person
		Beer.intoxicatedCal(b2, weight);
	}

}

