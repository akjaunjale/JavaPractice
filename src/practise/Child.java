package practise;

public class Child extends Parent {
	public Child() {
		System.out.println("Child's 0 Argument Constructor");
	}

	public Child(int a) {
		super(a);
		System.out.println("Child's 1 Argument Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		new Child();
		new Child(10);
	}

	{
		System.out.println("Child Instance Block");
	}

	static {
		System.out.println("Child Static Block");
	}
}
