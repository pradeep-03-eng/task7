package task7;

import java.util.ArrayList;
import java.util.List;

public class Listtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a List of Strings
        List<String> persons = new ArrayList<>();
        persons.add("Arjun");
        persons.add("Bala");
        persons.add("Elango");
        persons.add("David");

        // Convert List to Array
        String[] fruitArray = persons.toArray(new String[0]);

        // Print the array
        System.out.println("Array elements:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}
	
