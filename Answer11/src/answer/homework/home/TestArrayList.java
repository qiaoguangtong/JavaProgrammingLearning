package answer.homework.home;
import java.util.ArrayList;
import java.util.Date;

import list.CircleFromSimpleGeometricObject;
import list.Loan;

/**
 * @author Master_Joe
 *
 */
public class TestArrayList {
	public static void main(String [] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(new Loan());
		list.add(new Date());
		list.add(new String());
		list.add(new CircleFromSimpleGeometricObject());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
