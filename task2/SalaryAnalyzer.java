package task2;

import java.util.Scanner;

public class SalaryAnalyzer {
	public static void main(String[] args) {
		String name;
		int age,salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter age : ");
		age = sc.nextInt();
		System.out.println("Enter salary : ");
		salary = sc.nextInt();
		
		if(salary > 50000) {
			System.out.println("salary is good");
		}
		else {
			System.out.println("need progress");
		}
	}
}
