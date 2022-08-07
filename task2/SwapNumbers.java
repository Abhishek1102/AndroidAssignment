package task2;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args){
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number for x : ");
		x = sc.nextInt();
		
		System.out.println("Enter any number for y : ");
		y = sc.nextInt();
		
		System.out.println("Value of x is "+x+" and value of y is "+y+"");
		System.out.println("Values are now swapped");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Now value of x is "+x+"");
		System.out.println("Now value of y is "+y+"");

	}
}
