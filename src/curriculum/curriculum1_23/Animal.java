package curriculum.curriculum1_23;
/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	
*/
public class Animal {
	/* ----------- フィールド ---------- */
	private String className;
	private double length;
	private int speed;
	
	
	/* ----------- コンストラクタ ---------- */
	public Animal() {
		className = "";
		length = 0.0;
		speed = 0;
	}
	
	
	/* ----------- アクセサ ---------- */
	public String getClassName() {
		return className;
	}
	
	public double getLength() {
		return length;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setClassName(String name) {
		this.className = name;
	}
	
	public void setLength(double len) {
		this.length = len;
	}
	
	public void setSpeed(int sp) {
		this.speed = sp;
	}
	
	
	/* ----------- メソッド ---------- */
	public void printSelfInfo() {
		System.out.printf("動物名：%s\n", className);
		System.out.printf("体長：%.1fm\n", length);
		System.out.printf("速度：%dkm/h\n", speed);
	}
}
