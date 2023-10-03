package curriculum.curriculum1_26;
import java.util.Scanner;

import curriculum.common.NullCheck;

public class RunCurriculum {

	public static void main(String[] args) {
		/** 入力受付用インスタンス */
		Scanner scn = new Scanner(System.in);
		// 入力受付
		System.out.println("データを入力してください");
		/** 入力格納用変数 */
		String input = scn.nextLine();
		
		// 入力が空でなければプログラム継続
		if(NullCheck.nullCheck(input)) {
			/** 動物毎にデータを分割した配列 */
			String[] animalsSplitData = input.split(",");
			/** 動物毎のインスタンスを格納する配列 */
			Animal[] animals = new Animal[animalsSplitData.length];
			
			// 入力されているデータ分の Animal クラスのインスタンスを作って情報表示
			for(int i = 0; i < animalsSplitData.length; i++) {
				/** 一時的にステータスごとに分割したデータを格納する用の配列 */
				String[] data = animalsSplitData[i].split(":");
				// Animal クラスのインスタンス作成
				animals[i] = new Animal(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]));
				// 動物毎の情報表示
				System.out.println();
				animals[i].printInfo();
			}
		}
		// スキャナーを閉じる
		scn.close();
	}

}
