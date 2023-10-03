package curriculum.curriculum1_25.processing;

public class Adventurer extends Human {
	/* ----------- フィールド ---------- */
	private int mp;
	private int attack;
	private int defence;
	
	/* ----------- コンストラクタ ---------- */
	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param hp HP
	 * @param mp MP
	 * @param attack 攻撃力
	 * @param defence 防御力
	 * @param speed 素早さ
	 */
	public Adventurer(String name, int hp, int mp, int attack, int defence, int speed) {
		super(name, hp, speed);
		this.mp = mp;
		this.attack = attack;
		this.defence = defence;
	}
	
	/* ----------- アクセサ ---------- */
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	public int getMp() {
		return mp;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefence() {
		return defence;
	}
	
	/* ----------- フィールド ---------- */
	/**
	 * ステータスとメッセージ表示
	 */
	public void printStat() {
		System.out.printf("こんにちは 「 %s 」 さん\n", name);
		System.out.println("ステータス");
		System.out.printf("HP：%d\n", hp);
		System.out.printf("MP：%d\n", mp);
		System.out.printf("攻撃力：%d\n", attack);
		System.out.printf("素早さ：%d\n", speed);
		System.out.printf("防御力：%s\n", defence);
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}
}
