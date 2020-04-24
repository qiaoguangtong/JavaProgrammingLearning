package com.test;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Master_Joe
 *
 */
public class test {
	public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int integer = scanner.nextInt();
       list.add(integer);
       while(true) {
    	   System.out.print("Enter an integer: ");
           integer = scanner.nextInt();
           list.add(integer);
           for(int i = 0; i < list.size() - 1; i++) {
        	   if(integer == list.get(i)) {
        		   System.out.println("You've entered " + integer);
        		   break;
        	   }
           }
       }
       
    }
}
