package curriculum.curriculum1_28.processing;

public class Prefecture {
	/* ----------- フィールド ---------- */
	private String prefecture;
	private String city;
	private double area;
	
	/* ----------- コンストラクタ ---------- */
	public Prefecture(String pre, String city, double area) {
		this.prefecture = pre;
		this.city = city;
		this.area = area;
	}
	
	/* ----------- アクセサ ---------- */
	public String getPrefecture() {
		return prefecture;
	}
	public String getCity() {
		return city;
	}
	public double getArea() {
		return area;
	}
	
	public void setPrefecture(String pre) {
		this.prefecture = pre;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setArea(double area) {
		this.area = area;
	}

	/* ----------- メソッド ---------- */
	/**
	 * 情報表示
	 */
	public void printInfo() {
		System.out.printf("都道府県名：%s\n", prefecture);
		System.out.printf("県庁所在地：%s\n", city);
		System.out.printf("面積：%.1fkm2\n", area);
	}
}