package task4;

class  parent {
	void print() {
	System.out.println("This is a parent class");
	}
}
class child {
	void print() {
	System.out.println("This is a child class");
	}
}
class grandchild {
	void print() {
	System.out.println("This is a grandchild class");
	}
}

public class Prog4 {
	
	public static void main(String[] args) {
		parent p = new parent();
		child c = new child();
		grandchild g = new grandchild();
		
		p.print();
		c.print();
		g.print();
	}
}
