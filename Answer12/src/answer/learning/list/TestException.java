package answer.learning.list;
/**
 * @author Master_Joe
 *
 */
public class TestException {
	public static void main(String [] args) {
		try {
			System.out.println(sum(new int[] {1,2,3,4,5}));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			System.out.println("Trace Info Obtained from getStackTrace");
			StackTraceElement[] traceElements  = e.getStackTrace();
			for(int i = 0; i < traceElements.length; i++) {
				System.out.print("Method " + traceElements[i].getMethodName());
				System.out.print("(" + traceElements[i].getClassName() + ": ");
				System.out.println(traceElements[i].getLineNumber() + ")");
			}
		}
	}
	
	
	/** Return the sum of an integer array */
	public static int sum(int []list) {
		int result = 0; 
		for (int i = 0; i <= list.length; i++) {
			result += list[i];
		}
		
		return result;
	}
}
