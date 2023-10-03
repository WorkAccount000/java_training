package curriculum.curriculumB;

/**
 * じゃんけんゲームの処理を行うクラス
 */
public class Janken {
	/* ----------- メソッド ---------- */
	/**
	 * じゃんけんプログラム実行
	 * @param name プレイヤー名
	 * @param self 自身の手
	 * @param enem 相手の手
	 * @return 勝敗
	 */
	public static boolean play(String name, int self, int enem) {
		/** 自身の手 */
		String selfOpeStr = opeToString(self);
		/** 相手の手 */
		String enemOpeStr = opeToString(enem);
		/** 勝敗判定用の計算値 */
		int playResult = judge(self, enem);
		/** 勝敗 */
		boolean result = (playResult == 2 ? true : false);
		
		// 自身と相手の手を表示
		System.out.printf("%sの手は「%s」\n", name, selfOpeStr);
		System.out.printf("相手の手は「%s」\n", enemOpeStr);
		// 勝敗によってメッセージ表示
		printResultMessage(playResult, enem);
		return result;
	}
	
	/**
	 * じゃんけんの勝敗を算出
	 * @param self 自身の手
	 * @param enem 相手の手
	 * @return 勝敗の算出値
	 */
	private static int judge(int self, int enem) {
		// 勝敗の計算
		int result = (self - enem + 3) % 3;
		return result;
	}
	
	/**
	 * じゃんけんの手を文字列にして返す
	 * @param numOpe 手を表す数値
	 * @return 文字列にした手
	 */
	private static String opeToString(int numOpe) {
		/** 文字列で表す手 */
		String ope;
		// 文字列化の処理
		if(numOpe == 0) ope = "グー";
		else if (numOpe == 1) ope = "チョキ";
		else if (numOpe == 2) ope = "パー";
		else ope = "不正な値です";
		return ope;
	}
	
	/**
	 * 勝敗などによって適したメッセージを表示
	 * @param playRes 勝敗の算出値
	 * @param enem 相手の手
	 */
	private static void printResultMessage(int playRes, int enem) {
		// 勝敗などの結果によって分岐してメッセージを表示
		if(playRes == 2) {
			// 勝った場合
			System.out.println("やるやん。\n次は俺にリベンジさせて");
		} else if(playRes == 0) {
			// あいこの場合
			System.out.println("DRAW あいこ もう一回しましょう！");
		} else if(playRes == 1) {
			// 負けた場合
			System.out.println("俺の勝ち！");
			if(enem == 0) {
				// 相手がグー
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			} else if (enem == 1) {
				// 相手がチョキ
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
			} else if (enem == 2) {
				// 相手がパー
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
			}
		}
	}
}
