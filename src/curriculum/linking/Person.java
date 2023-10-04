package curriculum.linking;

public class Person {
	private static int count = 0;
	private String firstName;
	private String lastName;
	private int age;
	private double height, weight;

	Person(String firstName, String lastName, int age, double height, double weight){
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.height = height;
	this.weight = weight;
	Person.count++;
	}

	public String getFullName(){
	return this.firstName + this.lastName;
	}

	public void print(){
		System.out.printf("名前は%sです\n", getFullName());
		System.out.printf("年は%d才です\n", age);
	}

	private double bmi(){
		return weight / Math.pow(height, 2);
	}

	public static void printCount(){
		System.out.printf("合計%d人です\n", Person.count);
	}
	
	public void buy(Car car) {
		car.setOwner(this.getFullName());
		System.out.printf("%sが購入しました\n", getFullName());
	}
	
	public void buy(Bicycle bicy) {
		bicy.setOwner(this.getFullName());
		System.out.printf("%sが購入しました\n", getFullName());
	}
}
