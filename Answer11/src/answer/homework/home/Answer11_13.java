package answer.homework.home;

import java.util.ArrayList;

/**
 * @author Master_Joe
 *
 */
public class Answer11_13 {
	/** Main method */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter ten integers: ");
		for(int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 10));
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		removeDuplicate(list);
		System.out.print("The distinct integers are: ");
		for(Integer as: list) {
			System.out.print(as + " ");
		}
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(list.get(j));
					j--;
				}
			}
		}
	}
}
