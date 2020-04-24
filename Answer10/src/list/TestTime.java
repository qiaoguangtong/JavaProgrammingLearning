package list;

public class TestTime {
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		
		System.out.println("The t1\'s hour is " + t1.getHour());
		System.out.println("The t1\'s minute is " + t1.getMinute());
		System.out.println("The t1\'s second is " + t1.getSecond());
		
		System.out.println("The t2\'s hour is " + t2.getHour());
		System.out.println("The t2\'s minute is " + t2.getMinute());
		System.out.println("The t2\'s second is " + t2.getSecond());
		
	}
}
