package curriculum.common;

public class NullCheck {/**
	 * null と空文字のチェック
	 * @param str チェックする文字列
	 * @return 検査結果：正常なら true
	 */
	public static boolean nullCheck(String str) {
		boolean result = false;
		if (!(str == null || str.isEmpty())) result = true;
		return result;
	}

}
