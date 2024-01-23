package practise;

public class Parent {
	{
		System.out.println("Parent Instance Block");
	}

	static {
		System.out.println("Parent Static Block");
	}

	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("Parent's 0 Argument Constructor");
	}

	public Parent(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Parent's 1 Argument Constructor");
	}
}