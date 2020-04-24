package List;

public class list7_06 {
	/** LinearSearch */
	/** The method for finding key in the list */
	public static int linearSearch(int []list, int key) {
		for(int i = 0; i<list.length; i++) {
			if(key == list[i] ) {
				return i;
			}
		}
		return -1;
	}
}
