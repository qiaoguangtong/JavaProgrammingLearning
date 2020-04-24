package answer.homework.home;

import java.util.ArrayList;

/**
 * @author Master_Joe
 *
 */
public class Answer11_10 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(2);
		list.add(9);
		for (Integer as : list)
			System.out.print(as + " ");
		System.out.println();

		sort(list);
		for (Integer as : list)
			System.out.print(as + " ");
	}

	public static void sort(ArrayList<Integer> list) {
		int temp = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 1 + i; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

	}
}