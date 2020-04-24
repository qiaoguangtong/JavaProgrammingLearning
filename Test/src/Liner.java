public class Liner {
	public static void main(String[] args) {
		Node node = new Node();
		node.data = "Jack";
		node.next = new Node();
		node.next.data = "Guangtong";
		Node k = node;
		k.next = node.next;
		k = k.next;
		System.out.println("k.data = " + k.data);
		System.out.println("k.next.data = " + k.next.data);
	}
}
class Node {
	int index;
	Node next;
	String data;
}
