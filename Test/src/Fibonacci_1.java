import java.util.Scanner;

public class Fibonacci_1{
    public static void main(String[] args){
         //int n = Integer.parseInt(args[0]);    //将String型转换为int型
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	
         for(int i=1; i<=n; i++){
             System.out.print(fibonacci(i)+" ");
         }
    }
    public static int fibonacci(int num){
        if(num<=2){         //递归的跳出条件
            return 1;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);  //第n个斐波那契数是第n-1和第n-2之和
        }
    }
}

