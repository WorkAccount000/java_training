package curriculum.curriculum1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String name;
	// Q2：フィールドに動物の数の変数を定義してください。
	private int num;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		name = "犬";
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return this.num;
	}
}
