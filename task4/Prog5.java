package task4;

class Area {
	void findarea(int a,int b) {
		System.out.println("Area of rectangle is "+a*b);
	}
	
	void findarea(int a) {
		System.out.println("Area of square is "+a*a);
	}
}

public class Prog5 {

	public static void main(String[] args) {
		Area a = new Area();
		a.findarea(2,3);
		a.findarea(2);
	}
}
