package task3;

class Parent {
	void par() {
		System.out.println("This is a parent class");
	}
}

class Child extends Parent {
	void chi() {
		System.out.println("This is a child class");
	}
}

public class Prog4 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		p1.par();
		c1.chi();
		c1.par();
	}
}
