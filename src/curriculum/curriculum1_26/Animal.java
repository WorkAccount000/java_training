package curriculum.curriculum1_26;
import java.util.HashMap;

public class Animal {
	/* ----------- フィールド ---------- */
	private static HashMap<String, String> dic = new HashMap<String, String>() {
		{
			put("ライオン", "パンテラ レオ");
			put("ゾウ", "ロキソドンタ・サイクロティス");
			put("パンダ", "アイルロポダ・メラノレウカ");
			put("チンパンジー", "パン・トゥログロディテス");
			put("シマウマ", "チャップマンシマウマ");
			put("インコ", "不明");
		}
	};
	private String name;
	private double length;
	private int speed;
	private String scientific;
	
	/* ----------- コンストラクタ ---------- */
	public Animal(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientific = dic.get(name);
	}
	
	/* ----------- アクセサ ---------- */
	public String getName() {
		return name;
	}
	public double getLength() {
		return length;
	}
	public int getSpeed() {
		return speed;
	}
	public String getScientific() {
		return scientific;
	}
	
	public void setName(String name) {
		this.name = name;
		this.scientific = dic.get(name);
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/* ----------- メソッド ---------- */
	/**
	 * インスタンスの情報を表示
	 */
	public void printInfo() {
		System.out.printf("動物名：%s\n", name);
		System.out.printf("体長：%.1fm\n", length);
		System.out.printf("速度：%dkm/h\n", speed);
		System.out.printf("学名：%s\n", scientific);
	}
}