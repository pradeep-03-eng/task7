package task7;

import java.util.Scanner;

public class Arithmeticexception {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();
	        
	        try {
	            int result = divide(num1, num2);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	    }

	    public static int divide(int a, int b) {
	        return a / b; 
	    }
	}

