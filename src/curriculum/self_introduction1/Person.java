package curriculum.self_introduction1;

public class Person {
	/* ----------- フィールド ---------- */
	public static int count = 0;
	public String name;
	public int age;
	public double height;
	public double weight;

	/* ----------- コンストラクタ ---------- */
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}
	
	/* ----------- メソッド ---------- */
	private double bmi() {
		return weight / Math.pow(height, 2);
	}
	
	public void print() {
		System.out.printf("名前は%sです\n", name);
		System.out.printf("年は%d才です\n", age);
		System.out.printf("BMIは%.1fです\n", bmi());
	}
	
}
