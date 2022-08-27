package task4;

import java.util.Scanner;

public class Prog3 {
	
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not Valid");
//			try {
//				throw new MyException();
//			}
//			catch(MyException e) {
//				e.printStackTrace();
//			}
		}
		else {
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String[] args) {
			validate(15);
	}
}
