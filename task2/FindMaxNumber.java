package task2;

import java.util.Scanner;

public class FindMaxNumber {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a");
		a = sc.nextInt();
		System.out.println("Enter number b");
		b = sc.nextInt();
		System.out.println("Enter number c");
		c = sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a is greater");
		}else if(b>=a && b>=c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
		
	}
}
