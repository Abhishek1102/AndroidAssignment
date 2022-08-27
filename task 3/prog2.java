package task3;

class print {
	void printn(int n,String s) {
		System.out.println("Integer " + n + " String " + s);
	}
	
	void printn(String s,int n) {
		System.out.println("String " + s + " Integer " + n);
	}
}

public class prog2 {
	public static void main(String[] args) {
		print p = new print();
		p.printn(1,"1");
		p.printn("1",1);
	}
}
