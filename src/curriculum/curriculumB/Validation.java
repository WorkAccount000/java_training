package curriculum.curriculumB;

/**
 * 入力文字列のバリデーション処理用クラス
 */
public class Validation {
	/* ----------- メソッド ---------- */
	/**
	 * バリデーションチェックを行うクラスメソッド
	 * @param text チェックを行う対象の文字列
	 * @return チェック結果
	 */
	public static boolean validation(String text) {
		/** 結果返却用変数 */
		boolean result = false;

		/** 文字数オーバーの場合のメッセージ */
		String lenError = "名前を10文字以内にしてください";
		/** 入力がないの場合のメッセージ */
		String nullError = "名前を入力してください";
		/** 半角じゃないの場合のメッセージ */
		String langError = "半角英数字のみで名前を入力してください";
		
		// バリデーションチェック
		if (!nullCheck(text)) {
			// null か空文字だった場合 null 用エラーメッセージ表示
			System.out.println(nullError);
		} else if(!lengthCheck(text) || !langageCheck(text)) {
			// 文字数か半角チェックで不適正だった場合それぞれ適したエラーメッセージを表示
			if(!lengthCheck(text)) System.out.println(lenError);
			if(!langageCheck(text)) System.out.println(langError);
		} else {
			// 全て正常だった場合チェック結果を true にする
			result = true;
		}
		return result;
	}
	
	/**
	 * 10 文字以内かチェック
	 * @param text 検査する文字列
	 * @return 検査結果
	 */
	private static boolean lengthCheck(String text) {
		/** 結果返却用の変数 */
		boolean result = false;
		// 10 文字以内であれば結果を true にする
		if(text.length() <= 10) result = true;
		return result;
	}
	
	/**
	 * null と空文字のチェック
	 * @param text 検査する文字列
	 * @return 検査結果
	 */
	private static boolean nullCheck(String text) {
		/** 結果返却用の変数 */
		boolean result = false;
		// null でも空文字でもなければ結果を true にする
		if(!(text == null || text.isEmpty())) result = true;
		return result;
	}
	
	/**
	 * 半角英数かどうかチェック
	 * @param text 検査する文字列
	 * @return 検査結果
	 */
	private static boolean langageCheck(String text) {
		/** 結果返却用の変数 */
		boolean result = false;
		// 文字列が半角英数のみで構成されていれば結果を true にする
		if(text.matches("^[A-Za-z0-9]+$")) result = true;
		return result;
	}

}
