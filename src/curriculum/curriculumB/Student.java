package curriculum.curriculumB;

/**
 * 生徒の各教科の点数を管理するクラス
 */
public class Student {
	/* ----------- フィールド ---------- */
	/** 英語の点数 */
	private int english;
	/** 数学の点数 */
	private int math;
	/** 理科の点数 */
	private int science;
	/** 社会の点数 */
	private int society;
	
	/* ----------- コンストラクタ ---------- */
	
	public Student(int[] list) {
		this.english = list[0];
		this.math = list[1];
		this.science = list[2];
		this.society = list[3];
	}
	
	public Student(int eng, int math, int scie, int soci) {
		this.english = eng;
		this.math = math;
		this.science = scie;
		this.society = soci;
	}
	
	/* ----------- アクセサ ---------- */
	
	public int getEnglish() {
		return this.english;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public int getScience() {
		return this.science;
	}
	
	public int getSociety() {
		return this.society;
	}
	
	public void setEnglish(int num) {
		this.english = num;
	}
	
	public void setMath(int num) {
		this.math = num;
	}
	
	public void setScience(int num) {
		this.science = num;
	}
	
	public void setSociety(int num) {
		this.society = num;
	}
	
	/* ----------- メソッド ---------- */
	
	/**
	 * 各教科の点数を配列にして返す
	 * @return 各教科の点数の配列
	 */
	public int[] getScoreList() {
		int[] result = {this.english, this.math, this.science, this.society};
		return result;
	}
	
	/**
	 * 全教科の平均点を返す
	 * @return 全ての教科の点数から算出した平均点
	 */
	public double getAvg() {
		double avg = (double)(this.english + this.math + this.science + this.society) / 4;
		return avg;
	}
	
	/**
	 * 全教科の合計点を返す
	 * @return 全教科の合計点
	 */
	public int getTotal() {
		return this.english + this.math + this.science + this.society;
	}
}
