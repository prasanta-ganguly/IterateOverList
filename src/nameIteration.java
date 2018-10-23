import java.util.ArrayList;
import java.util.List;

/*This will iterates on a list of names and print all names 
if total number of characters of all name is <= 8 characters it prints "PASS"
if total number of characters of a name is greater than 8 then it prints "FAIL"*/

public class nameIteration {

	public static void main(String[] args) {

		//Declaring and initializeing the list
		List<String> names = new ArrayList<String>();
		//Adding names to list array
		names.add("Prasanta");
		names.add("Ashish");
		names.add("Jennifer");
		names.add("Crystal");
		names.add("Addison");
		names.add("Himanshu");
		
		boolean flag = true;
		
		//iterates over the list names
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
			//Checking if any name is longer than 8 characters
			//If any name is longer than 8 characters then loop will terminate
			if(count(names.get(i))>8) {
				System.out.println("FAIL");
				flag=false;
					break;
				
			}
		}
		//Checking if all names are <= 8 characters
		if(flag) {
			System.out.println();
			System.out.println("PASS");
		}
		//returning the total number of names in the list
		System.out.println();
		numberReturn(names);

	}
	
	// function that returns number of characters of list names
	static int count(String str) {
		char[] ch = str.toCharArray();
	return ch.length;
	        }
	//function that returns number of items in a list
	static int numberReturn(List listName) {
		System.out.println("Number of names in the list = "+listName.size());
		return listName.size();

	}
}
