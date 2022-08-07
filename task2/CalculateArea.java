package task2;

import java.util.Scanner;

public class CalculateArea {
	public static void main(String[] args) {
		int process;
		System.out.println("1->Area of Triangle 2->Area of Circle 3->Area of Rectangle");
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		process = sc.nextInt();
		
		switch(process){
		case 1:
			int b,h,areaT;
			System.out.println("Enter breadth");
			b = sc.nextInt();
			System.out.println("Enter height");
			h = sc.nextInt();
			areaT = (b*h)/2;
			System.out.println(areaT);
			break;
		case 2:
			double pi = 3.14,areaC;
			int r;
			System.out.println("Enter radius");
			r = sc.nextInt();
			areaC = pi * r * r;
			System.out.println(areaC);
			break;
		case 3:
			int length,width,areaR;
			System.out.println("Enter length");
			length = sc.nextInt();
			System.out.println("Enter width");
			width = sc.nextInt();
			areaR = length * width;
			System.out.println(areaR);
		default:
			System.out.println("Unknown number");
		}
		
	}
}
