package JavaHashMap; // projected made in eclipse
import java.util.HashMap; // imported HashMap class

public class JavaCelebritiesNameAgePT2 {// created public class 'JavaNameAgePT2'

	public static void main(String[] args) { // reads,runs & executes code
	
	// created an object of the imported class named 'peoplesNameAge'
	// imported HashMap was set up as 'HashMap<String,Integer>'
		HashMap<String,Integer> peoplesNameAge = new HashMap<String,Integer>();
	
	// object calls onto the '.put' function to put the name and age into the object
		peoplesNameAge.put("Weezy", 42);
		peoplesNameAge.put("Drake", 38);
		peoplesNameAge.put("Weezy", 42);
		peoplesNameAge.put("Nicki Minaj", 42);
		peoplesNameAge.put("Chris Brown", 36);
		peoplesNameAge.put("Ice Spice", 25);
		peoplesNameAge.put("Latto", 26);
		peoplesNameAge.put("Renni Rucci", 32);
	
	// display text
		System.out.println("Celebrities and there age: ");
		
// for loop created, with a String attribute made called 'NameAge' and takes in the information
// from the object 'peoplesNameAge'
// when displaying celebrities Name it takes the 'first key' of the information and displays it
// when displaying the age, the object calls onto the '.get()' function and in the brackets of the function
// it has the String variable name created in the for loop 'NameAge' - peoplesNameAge.get(NameAge)		
		for(String NameAge : peoplesNameAge.keySet()) {
			System.out.println("Celebrities Name: " + NameAge + "-> " + " Age: " + peoplesNameAge.get(NameAge));
		}
		
		System.out.println("Thank you."); // displays text once the loop has finished
	}

}

// Celebrities and there age: 
//Celebrities Name: Latto->  Age: 26
//Celebrities Name: Ice Spice->  Age: 25
//Celebrities Name: Chris Brown->  Age: 36
//Celebrities Name: Nicki Minaj->  Age: 42
//Celebrities Name: Renni Rucci->  Age: 32
//Celebrities Name: Drake->  Age: 38
//Celebrities Name: Weezy->  Age: 42
//Thank you.
