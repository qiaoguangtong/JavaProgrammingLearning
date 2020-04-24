import java.util.Scanner;

public class testAnswer5_08 {
	public static void main(String []args) {
	    Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student:");
        int num = input.nextInt();
        double highestScore = 0, higherScore = 0;
        String highestName = "", higherName = "";

        for (int count = 0; count < num; count++) {
            System.out.print("Enter the  " + (count + 1) + " student\'s name:");
            String name = input.next();
            System.out.print("Enter the  " + (count + 1) + " student\'s score:");
            double score = input.nextDouble();

            if (score > highestScore && score > higherScore) {
                highestScore = score;
                highestName = name;

            }
            else if (score < highestScore && score > higherScore){
                higherScore = score;
                higherName = name;
            }
        }

        System.out.println("The best student is " + highestName +
            " and the socre is " + highestScore);
        System.out.println("The second student is " + higherName +
                " and the socre is " + higherScore);
	}
}
