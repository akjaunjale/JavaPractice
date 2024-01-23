package stringPractise;

public class Exam {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
	String str1 = "oneQuiz";
	String str2 = "oneQuiz";
	System.out.println("str1 == str2 is:" + str1 == str2);

	byte[] b = {100, 101, 102, 103};
	String s = new String(b);
	System.out.println(s);

	int dW = 4;
	int nD = 5;
	int sal = nD++ * --dW * dW++ * nD--;
	sal =- dW;
	System.out.println(dW + " "+ nD + " " + sal);

	int res = 0;
	Exam exam = new Exam();
	Object o = exam;

	if (exam.equals(o)) {
		System.out.println("1");
	}
	System.out.println(res);

	int i = 4;
	int j = 21;

	int k = ++i * 7 + 2 - j--;
	System.out.println(k);

	Boolean b1 = new Boolean("TRUE");
	Boolean b2 = new Boolean("true");
	Boolean b3 = new Boolean("tRue");
	Boolean b4 = new Boolean("false");

	if (b2.equals(b3)) {
		System.out.println("1");
	}
	if (b1.equals(b4)) {
		System.out.println("1");
	}

	String s1 = new String("sa");
	String s2 = "sa";
	String s3 = "s" + new String("a");
	String s4 = "s" + "a";
	System.out.println(s1==s2);
	System.out.println(s3==s4);

	}

}
