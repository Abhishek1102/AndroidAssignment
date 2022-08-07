package task2;

import java.util.Scanner;

public class AddSubDivMul {
	public static void main(String[] args) {
		int a,b,process;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for a");
		a = sc.nextInt();
		System.out.println("Enter number for b");
		b = sc.nextInt();
		System.out.println("Enter 1->add 2->sub 3->mul 4->div");
		process = sc.nextInt();
		
		switch(process) {
		case 1:
			System.out.println("add-> " + (a+b));
			break;
		case 2:
			System.out.println("sub->" + (a-b));
			break;
		case 3:
			System.out.println("mul->" + (a*b));
			break;
		case 4:
			System.out.println("div->" + (a/b));
			break;
		default: 
			System.out.println("Unknown number");
		}
	}
}
