package curriculum.curriculum1_25.run;
import java.util.Random;
import java.util.Scanner;

import curriculum.curriculum1_25.processing.Adventurer;

public class Departure {

	public static void main(String[] args) {
		/** 入力受付用スキャナー */
		Scanner scn = new Scanner(System.in);
		/** 乱数生成用インスタンス */
		Random rnd = new Random();
		
		// 名前の入力を受付て変数に格納
		String name;
		boolean nullChecker;
		do {
			System.out.println("名前を入力してください");
			name = scn.nextLine();
			nullChecker = nullCheck(name);
		} while(!nullChecker);
		
		// 各ステータスをランダムで決定
		/** HP */
		int hp = rnd.nextInt(999) + 1;
		/** MP */
		int mp = rnd.nextInt(999) + 1;
		/** 攻撃力 */
		int attack = rnd.nextInt(999) + 1;
		/** 防御力 */
		int defence = rnd.nextInt(999) + 1;
		/** 素早さ */
		int speed = rnd.nextInt(999) + 1;
		
		// 冒険者のインスタンス作成
		Adventurer man = new Adventurer(name, hp, mp, attack, defence, speed);
		// ステータス表示メソッド呼び出し
		man.printStat();
		// スキャナーを閉じる
		scn.close();
	}

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

}
