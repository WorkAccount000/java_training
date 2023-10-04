package curriculum.self_introduction2;

public class Person {
	private static int count = 0;
	public String name;
	public int age;
	public double height;
	      public double weight;

	Person(String name, int age, double height, double weight){
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	count++;
	}
	
	public static int getCount() {
		return count;
	}

	public double bmi(){
	return this.weight / this.height / this.height;
	}

	public void print(){
	System.out.println("名前は" + this.name + "です");
	System.out.println("年は" + this.age + "です");
	}
	
	public static void printCount() {
		System.out.printf("合計%d人です\n", count);
	}
}
