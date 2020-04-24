package answer.learning.list;

/**
 * @author Master_Joe
 *
 */
public class ChainedExceptionDemo {
	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void method1() throws Exception{
		try {
			method2();
		}catch(Exception ex) {
			throw new Exception("New Info from method1");
		}
	}
	
	public static void method2() throws Exception{
		throw new Exception("New Info from method2");
	}
}
