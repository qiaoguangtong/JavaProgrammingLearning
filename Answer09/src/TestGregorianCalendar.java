import java.util.GregorianCalendar;
public class TestGregorianCalendar {
	public static void main(String[] args){
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.get(GregorianCalendar.YEAR);
		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + " " +
							(gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + " " +
							gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		gregorianCalendar.setTimeInMillis(1234567898765L);
		//System.out.print();
		
	}
}
