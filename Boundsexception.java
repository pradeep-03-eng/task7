package task7;

public class Boundsexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayIndexOutOfBoundsException
		int[] numbers = {10, 20, 30};

        try {
            System.out.println("Accessing array index 5: " + numbers[5]); // Invalid 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        // StringIndexOutOfBoundsException
        String text = "Kumar";
        
        try {
            System.out.println("Accessing string index 10: " + text.charAt(10)); // Invalid
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        }
    }
}
	     
