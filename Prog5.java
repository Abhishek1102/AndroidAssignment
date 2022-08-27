package task3;

class Rectangle {
	double l,b;
	
	Rectangle(double l,double b){
		this.l = l;
		this.b = b;
	}
	
	void area() {
		System.out.println("Area of rectangle is" + l*b);
	}
	
	void perimeter() {
		System.out.println("Perimeter of rectangle is" + 2*(l+b));
	}
	
}

class Square extends Rectangle {

	Square(double l, double b) {
		super(l, b);
		// TODO Auto-generated constructor stub
	}

	
	
}

public class Prog5 {
	public static void main(String[] args) {
		Square  s1 = new Square(1,2);
	}
}
