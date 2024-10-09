package task7;

import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Adding employees (employee ID as key, name as value)
        employeeMap.put(101, "Arjun");
        employeeMap.put(102, "Elango");
        employeeMap.put(103, "Bala");
        employeeMap.put(104, "David");

        // Print employee names in alphabetical order
        System.out.println("Employee Names in Alphabetical Order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}
