package task3;

class PrintNumber {
	void printn(int n) {
		System.out.println("Number " + n);
	}
	void printn(String n) {
		System.out.println("String " + n);
	}
	void printn(double n) {
		System.out.println("Float " + n);
	}
}

public class PrintNum {
	public static void main(String[] args) {
		PrintNumber p1 = new PrintNumber();
		p1.printn(1.2);
		p1.printn(1);
		p1.printn("1");
	}
}
