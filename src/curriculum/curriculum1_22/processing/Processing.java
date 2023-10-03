package curriculum.curriculum1_22.processing;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Processing {
	/*
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
	/* ----------- フィールド ---------- */
	private String line1;
	private String line2;
	private String line3;
	private String line4;
	
	
	/* ----------- コンストラクタ ---------- */
	public Processing() {
		/** 現在日時を取得 */
		Date now = new Date();
		/** 日時のフォーマット */
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		/** フォーマットに従って文字列化した現在日時 */
		String dateStr = dateFormat.format(now);
		// 各フィールドに値を代入
		this.line1 = "こんにちは！ここは日本です！";
		this.line2 = "この寿司はうまい";
		this.line3 = "寿司は和食です";
		if (nullCheck(dateStr)) this.line4 = String.format("今の現在日時は%sです", dateStr);
	}
	
	
	/* ----------- メソッド ---------- */
	/**
	 * null と空文字のチェック
	 * @param str チェックする文字列
	 * @return 検査結果
	 */
	private static boolean nullCheck(String str) {
		boolean result = false;
		if (!(str == null || str.isEmpty())) result = true;
		return result;
	}
	
	/**
	 * 自身のフィールドに従って文字列表示
	 */
	public void speak() {
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);
	}
}
