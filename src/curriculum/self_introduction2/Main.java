package curriculum.self_introduction2;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		
		System.out.printf("合計%d人です\n", Person.getCount());
		Person.printCount();
	}

}
