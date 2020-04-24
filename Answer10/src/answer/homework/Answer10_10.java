package answer.homework;

/**
 * @author Master_Joe
 *
 */
public class Answer10_10 {
	public static void main(String[] args) {
		Queue newQueue = new Queue();
		// Initialize the queue
		for(int i = 0; i < 21; i++) {
			newQueue.enqueue(i);
		}
		
		// Save the size for a queue
		int queueSize = newQueue.getSize();
		for(int i = 0; i < queueSize; i++) {
			System.out.print(newQueue.dequeue() + " ");
		}
	}
}

class Queue {
	private static final int DEFAULT_CAPACITY = 8;
	private int[] elements;
	private int size;

	public Queue() {
		this(DEFAULT_CAPACITY);
	}

	public Queue(int capacity) {
		elements = new int[capacity];
	}

	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length +2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}

	public int dequeue() {
		int element0 = elements[0];
		for (int i = 0; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return element0;
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}