package List;

public class list7_03 {
	/** TestPassArray */
	public static void main(String []args) {
		int []a = {1,2};
		// Swap elements using swap method */
		System.out.println("Before invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "} ");	
		swap(a[0],a[1]);
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
		
		// Swap elements using the swapFirstTwoInArray method
		System.out.println("Before invoking swapFirstTwoArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
		swapFirstTwoArray(a);
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "} ");
	}
	
	/** Swap two variables */
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	/** Swap the first two elements in the arrray */
	public static void swapFirstTwoArray(int [] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}
}
