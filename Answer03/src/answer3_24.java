
public class answer3_24 {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 100) % 52;
		String str = "";
		switch (number) {
		case 0:
		case 1:
		case 2:
		case 3:
			str = "Ace";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			str = "2";
			break;
		case 8:
		case 9:
		case 10:
		case 11:
			str = "3";
			break;
		case 12:
		case 13:
		case 14:
		case 15:
			str = "4";
			break;
		case 16:
		case 17:
		case 18:
		case 19:
			str = "5";
			break;
		case 20:
		case 21:
		case 22:
		case 23:
			str = "6";
			break;
		case 24:
		case 25:
		case 26:
		case 27:
			str = "7";
			break;
		case 28:
		case 29:
		case 30:
		case 31:
			str = "8";
			break;
		case 32:
		case 33:
		case 34:
		case 35:
			str = "9";
			break;
		case 36:
		case 37:
		case 38:
		case 39:
			str = "10";
			break;
		case 40:
		case 41:
		case 42:
		case 43:
			str = "Jack";
			break;
		case 44:
		case 45:
		case 46:
		case 47:
			str = "Queen";
			break;
		case 48:
		case 49:
		case 50:
		case 51:
			str = "King";
			break;
		}
		int remainder = number % 4;
		String str2 = "";
		switch (remainder) {
		case 0:
			str2 = "Clubs";
			break;
		case 1:
			str2 = "Diamonds";
			break;
		case 2:
			str2 = "Hearts";
			break;
		case 3:
			str2 = "Spades";
			break;
		}
		System.out.println("The card of you picked is " + str + " of "+str2);
	}
}
