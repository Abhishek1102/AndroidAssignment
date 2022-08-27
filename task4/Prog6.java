package task4;

class Demo {
	void findarea(double b,int a) {
		System.out.println(b+a);
	}
	
	void findarea(int a,double b) {
		System.out.println(a+b);
	}
}

public class Prog6 {

	public static void main(String[] args) {
		Demo a = new Demo();
		a.findarea(2,2.2);
//		a.findarea(2.5+2);
	}
}