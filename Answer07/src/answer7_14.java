public class answer7_14{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int [] numbers = new int[10];
        for(int i = 0; i< numbers.length; i++)
            numbers[i] = input.nextInt();

        System.out.print("The greatest common divisor for the ten numbers is " + getGCD(numbers));
    }

    /** Get the greatest common divisor of two numbers */
    public static int getGCD(int a, int b){
        int k = 1;
        for(int i = 2; i<= Math.min(a, b); i++){
            if(a%i==0&&b%i==0)
                k = i;
        }
        return k;
    }

    /** Get the greatest common divisor for an array */
    public static int getGCD(int... numbers){
        int gcd = 1;
        for(int i = 1; i < numbers.length; i++){
            gcd = getGCD(numbers[i - 1], numbers[i]);
        }
        return gcd;
    }
}