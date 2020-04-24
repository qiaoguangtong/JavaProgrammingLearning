package list;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		// Create a list to store cities
		ArrayList<String> cityList = new ArrayList<>();
		
		// Add some cities in the list
		cityList.add("London");
		// cityList now contains [London]
		cityList.add("Denver");
		// cityList now contains [London, Denver]
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		// cityList now contains [London, Denver, Paris, Miami, Seoul, Tokyo]
		
		System.out.println("List size? \n\t" + cityList.size());
		System.out.println("Is Miami in the list? \n\t" + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? \n\t" + cityList.indexOf("Denver"));
		System.out.println("Is Beijing in teh list?\n\t" + cityList.contains("Beijing"));
		System.out.println("Is the list empty? \n\t" + cityList.isEmpty());	// Print false
		
		// Insert a new city at index 2
		cityList.add(2, "Xi'an");
		// Contains [London, Denver, Xi'an, Paris, Miami, Seoul, Tokyo]
		
		// Remove a city from the list
		cityList.remove("Miami");
		// Contains [London, Denver, Xi'an, Paris, Seoul, Tokyo]
		
		// Remove a city at index 1
		cityList.remove(1);
		// Contains [London, Xi'an, Paris, Seoul, Tokyo]
		
		// Display the contents in the list
		System.out.println("The contents of the city list is " + cityList.toString());
		System.out.println();
		
		// Display the contents in the list in reverse order
		System.out.println("Display the cities in the list in reverse order: ");
		for(int i = cityList.size() - 1; i >=0; i--) {
			System.out.print(cityList.get(i) + " ");
		}
		System.out.println();
		
		// Create a list to store two citcles
		ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
		
		// Add two circles
		list.add(new CircleFromSimpleGeometricObject(2));
		list.add(new CircleFromSimpleGeometricObject(3));
		
		// Display the area of the first circle in the list
		System.out.println("The area of the circle? \n\t" + list.get(0).getArea());
		
	}
}
