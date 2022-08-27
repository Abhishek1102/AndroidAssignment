package task4;

class PrintNumber{
	void printn(int a) {
		System.out.println(a);
	}
	void printn(double a) {
		System.out.println(a);
	}
	void printn(float a) {
		System.out.println(a);
	}
	
}

public class Prog7 {
	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		p.printn(2);
		p.printn(2.2);
		p.printn(2.21446466464);
	}
}
