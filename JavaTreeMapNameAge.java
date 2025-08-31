package JavaTreeMap; //Project made in eclipse
import java.util.TreeMap; // imported TreeMap class


public class JavaTreeMapNameAge { // created public class 'JavaTreeMapNameAge'

	public static void main(String[] args) {//reads, runs & executes code
	
	// created an object from the TreeMap imported class named 'friendNameAge'
	// the class was set up to take String(txt) and Integer - TreeMap<String,Integer>
		TreeMap<String,Integer> friendNameAge = new TreeMap<String,Integer>();
		
	// used the object to call onto the '.put' function to put the name and age into the object
		friendNameAge.put("Emmanuel", 26);
		friendNameAge.put("Sola", 26);
		friendNameAge.put("Ciara", 24);
		friendNameAge.put("Emmanuel", 26); // Duplicate won't be added in
		friendNameAge.put("Matthew", 27);
	
	// Display Text
		System.out.println("Displaying names & age of friends");
	
	// for loop made, with a String attribute named 'details' which takes information from object
	// the object calls onto the '.keySet()' and puts all the information in key set values from 
	// the object into the String attribute
	// 'System.out.println' is set up to display the information from the object and attribute
	// String attribute 'details'
		for(String details: friendNameAge.keySet()) {
			System.out.println("Name: " + details + "-> " + "Age: " + friendNameAge.get(details));
		}

	}

}

//Result:
//Displaying names & age of friends
//Name: Ciara-> Age: 24
//Name: Emmanuel-> Age: 26
//Name: Matthew-> Age: 27
//Name: Sola-> Age: 26