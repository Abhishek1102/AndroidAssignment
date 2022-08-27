package task4;

import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a");
		a = sc.nextInt();
		System.out.println("Enter number b");
		b = sc.nextInt();
		
		try
		{
			int c = a/b;	
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println(e);	
		}
		
		System.out.println("Success");
		
	}
}
