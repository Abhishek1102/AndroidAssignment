package task2;

import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		num = sc.nextInt();
		if(num > 0) {
			System.out.println("The Number is positive");
		}
		else if(num == 0){
			System.out.println("The number is zero");
		}
		else {
			System.out.println("The number is negative");
		}
	}
}
