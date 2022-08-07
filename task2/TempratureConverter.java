package task2;

import java.util.Scanner;

public class TempratureConverter {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature : ");
		float c = sc.nextFloat();
		
		//converting celsius to farhenheit
		float f = c * (9.0f/5.0f)+32;
		System.out.println("The temprature is "+f+" degree Farhenheit");
	}
}
