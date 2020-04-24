import java.util.Arrays;

public class Answer722 {

	public static void main(String[] args) {
		String[] queenList0 = new String[8];
		String[] queenList1 = new String[8];
		String[] queenList2 = new String[8];
		String[] queenList3 = new String[8];
		String[] queenList4 = new String[8];
		String[] queenList5 = new String[8];
		String[] queenList6 = new String[8];
		String[] queenList7 = new String[8];

		int[] queenIndex = queenIndex();

		queenList(queenList0, queenList1, queenList2, queenList3, queenList4, queenList5, queenList6, queenList7,
				queenIndex);

		queenPrint(queenList0, queenList1, queenList2, queenList3, queenList4, queenList5, queenList6, queenList7);
	}

	private static int[] queenIndex() {
		int[] queenIndex = new int[8];
		queenIndex[0] = (int) (Math.random() * 8);
		for (int i = 1; i < queenIndex.length; i++) {
			boolean inLoop = true;
			while (inLoop) {
				boolean isDuplicate = false;
				int queen = (int) (Math.random() * 8);
				for (int j = 0; j < i; j++) {
					if (queenIndex[j] == queen) {
						isDuplicate = true;
						break;
					}
				}
				if (queenIndex[i - 1] == queen + 1 || queenIndex[i - 1] == queen - 1) {
					isDuplicate = true;
				}
				if (!isDuplicate) {
					queenIndex[i] = queen;
					inLoop = false;
				}
			}
		}
		return queenIndex;
	}

	private static void queenList(String[] queenList0, String[] queenList1, String[] queenList2, String[] queenList3,
			String[] queenList4, String[] queenList5, String[] queenList6, String[] queenList7, int[] queenIndex) {
		queenList0[queenIndex[0]] = "Q";
		queenList1[queenIndex[1]] = "Q";
		queenList2[queenIndex[2]] = "Q";
		queenList3[queenIndex[3]] = "Q";
		queenList4[queenIndex[4]] = "Q";
		queenList5[queenIndex[5]] = "Q";
		queenList6[queenIndex[6]] = "Q";
		queenList7[queenIndex[7]] = "Q";

		for (int i = 0; i < queenList0.length; i++) {
			if (queenList0[i] == null) {
				queenList0[i] = " ";
			}
		}
		for (int i = 0; i < queenList1.length; i++) {
			if (queenList1[i] == null) {
				queenList1[i] = " ";
			}
		}
		for (int i = 0; i < queenList2.length; i++) {
			if (queenList2[i] == null) {
				queenList2[i] = " ";
			}
		}
		for (int i = 0; i < queenList3.length; i++) {
			if (queenList3[i] == null) {
				queenList3[i] = " ";
			}
		}
		for (int i = 0; i < queenList4.length; i++) {
			if (queenList4[i] == null) {
				queenList4[i] = " ";
			}
		}
		for (int i = 0; i < queenList5.length; i++) {
			if (queenList5[i] == null) {
				queenList5[i] = " ";
			}
		}
		for (int i = 0; i < queenList6.length; i++) {
			if (queenList6[i] == null) {
				queenList6[i] = " ";
			}
		}
		for (int i = 0; i < queenList7.length; i++) {
			if (queenList7[i] == null) {
				queenList7[i] = " ";
			}
		}
	}

	private static void queenPrint(String[] queenList0, String[] queenList1, String[] queenList2, String[] queenList3,
			String[] queenList4, String[] queenList5, String[] queenList6, String[] queenList7) {
		for (String str : queenList0) {
			System.out.print(" | ");
			System.out.print(str);
		}
		System.out.println(" | ");
		for (String str : queenList1) {
			System.out.print(" | ");
			System.out.print(str);
		}
		System.out.println(" | ");
		for (String str : queenList2) {
			System.out.print(" | ");
			System.out.print(str);
		}
		System.out.println(" | ");
		for (String str : queenList3) {
			System.out.print(" | ");
			System.out.print(str);
		}
		System.out.println(" | ");
		for (String str : queenList4) {
			System.out.print(" | ");
			System.out.print(str);
		}
		System.out.println(" | ");
		for (String str : queenList5) {
			System.out.print(" | ");
			System.out.print(str);
		}
		System.out.println(" | ");
		for (String str : queenList6) {
			System.out.print(" | ");
			System.out.print(str);
		}
		System.out.println(" | ");
		for (String str : queenList7) {
			System.out.print(" | ");
			System.out.print(str);
		}
		System.out.print(" | ");
	}
}
