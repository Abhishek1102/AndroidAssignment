package task3;

class printarea{
	void area(double l,double b) {
		double a;
		a= l*b;
		System.out.println("Area of Rectangle " + a);
	}
	
	void area(double s) {
		double a;
		a= s*s;
		System.out.println("Area of Square " + a);
	}
}

public class Prog3 {
	public static void main(String[] args) {
		printarea p1 = new printarea();
		p1.area(2);
		p1.area(2,3);
	}
}
