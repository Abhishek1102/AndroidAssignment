package task2;

import java.util.Scanner;

public class MaxnumberTernary {
	public static void main(String[] args) {
		int a,b,c,max;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a");
		a = sc.nextInt();
		System.out.println("Enter number b");
		b = sc.nextInt();
		System.out.println("Enter number c");
		c = sc.nextInt();
		
		max = (a>b) ? (a>c ? a : c) : (b>c ? b:c);
		System.out.println("Max number is "+max);
		
	}
}
