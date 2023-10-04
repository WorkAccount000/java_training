package curriculum.linking;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		Person.printCount();
		
		Car car = new Car();
		// car.setOwner(person1.getFullName());
		person1.buy(car);
		
		Bicycle bicycle = new Bicycle();
		// bicycle.setOwner(person2.getFullName());
		person2.buy(bicycle);
		
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
	}

}
