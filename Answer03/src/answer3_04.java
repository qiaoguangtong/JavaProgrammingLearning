
public class answer3_04 {
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 100 % 13);
		switch (ran) {
		case 1:
			System.out.println(ran + "\tJanuary");
			break;
		case 2:
			System.out.println(ran + "\tFebruary");
			break;
		case 3:
			System.out.println(ran + "\tMarch");
			break;
		case 4:
			System.out.println(ran + "\tApril");
			break;
		case 5:
			System.out.println(ran + "\tMay");
			break;
		case 6:
			System.out.println(ran + "\tJune");
			break;
		case 7:
			System.out.println(ran + "\tJuly");
			break;
		case 8:
			System.out.println(ran + "\tAugust");
			break;
		case 9:
			System.out.println(ran + "\tSeptemper");
			break;
		case 10:
			System.out.println(ran + "\tOctober");
			break;
		case 11:
			System.out.println(ran + "\tNovember");
			break;
		case 12:
			System.out.println(ran + "\tDecember");
			break;
		default:
			System.out.println("ERROR");
		}

	}
}
