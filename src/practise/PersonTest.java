package practise;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new PersonRatan();
		person.eat();

		PersonRatan ratan = new PersonRatanKid();
		ratan.eat();

		Person person1 = new PersonRatanKid();
		person1.eat();

	}

}
