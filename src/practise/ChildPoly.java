package practise;

public class ChildPoly extends ParentPoly {

	int a = 1000;

	static void m1() {
		// TODO Auto-generated constructor stub
		System.out.println("Child's m1 method");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		ParentPoly parentPoly = new ChildPoly();
		// parentPoly.m1();
		ParentPoly.m1();
		System.out.println("Value of a is -" + parentPoly.a);
	}
}
