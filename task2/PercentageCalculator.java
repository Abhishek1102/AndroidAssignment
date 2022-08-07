package task2;

import java.util.Scanner;

public class PercentageCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float English,Maths,Science,History,Drawing,total,percentage;
		
		System.out.println("Enter marks of 5 subjects");
		
		System.out.println("Enter english marks : ");
		English = sc.nextFloat();
		
		System.out.println("Enter maths marks : ");
		Maths = sc.nextFloat();
		
		System.out.println("Enter science marks : ");
		Science = sc.nextFloat();
		
		System.out.println("Enter history marks : ");
		History = sc.nextFloat();
		
		System.out.println("Enter drawing marks : ");
		Drawing = sc.nextFloat();
		
		total = English+Maths+Science+History+Drawing;
		percentage = (total / 500) * 100;
		
		System.out.println("Percentage : "+ percentage);
		
	}
}
