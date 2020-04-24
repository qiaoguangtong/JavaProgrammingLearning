package list;
/**
 * @author Master_Joe
 *
 */

import java.util.ArrayList;

public class MyStack {
	private ArrayList<Object> list = new ArrayList<>();
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int getSize() {
		return list.size();
	}
	
	public Object peek() {
		return list.get(getSize() - 1);
	}
	
	public Object pop() {
		Object obj= list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return obj;		
	}
	
	public void push(Object obj) {
		list.add(obj);
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
