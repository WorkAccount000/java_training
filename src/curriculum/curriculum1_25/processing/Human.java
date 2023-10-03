package curriculum.curriculum1_25.processing;

public class Human {
	/* ----------- フィールド ---------- */
	protected String name;
	protected int hp;
	protected int speed;
	
	/* ----------- コンストラクタ ---------- */
	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param hp HP
	 * @param speed 素早さ
	 */
	public Human(String name, int hp, int speed) {
		this.name = name;
		this.hp = hp;
		this.speed = speed;
	}
	
	/* ----------- アクセサ ---------- */
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getSpeed() {
		return speed;
	}
	
	/* ----------- フィールド ---------- */
	/**
	 * ステータス表示
	 */
	public void printStat() {
		System.out.printf("こんにちは 「 %s 」 さん\n", name);
		System.out.println("ステータス");
		System.out.printf("HP：%d\n", hp);
		System.out.printf("素早さ：%d\n", speed);
	}

}
