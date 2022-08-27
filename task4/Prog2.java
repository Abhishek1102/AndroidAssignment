package task4;

import java.util.Scanner;

public class Prog2 {
	public static void main(String[] args) {
		int a=0,b,c,d;
		
		Scanner sc = new Scanner(System.in);	
		
		for(int i=0;i<5;i++) {
			a=sc.nextInt();
		}
		
		for(int j=0;j<5;j++) {
			if(a<10 || a>40) {
				System.out.println("Invalid");
			}
			else {
				System.out.println(a);
			}
		}
		
		
	}
}
