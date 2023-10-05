package curriculum.curriculum1_28.run;
import java.util.Scanner;

import curriculum.common.NullCheck;
import curriculum.curriculum1_28.processing.Prefecture;
import curriculum.curriculum1_28.processing.QuickSort;

public class RunCurriculum {

	public static void main(String[] args) {
		/* ----------- インデックス入力受付 ---------- */
		/** マスターデータ */
		Prefecture[] masterData = createMasterData();
		/** 入力受付のためのスキャナー */
		Scanner scn = new Scanner(System.in);
		
		// 入力受付
		System.out.println(", (カンマ) 区切りでソートしたい都道府県のインデックスを入力してください");
		/** ターゲットデータのインデックス入力受付 */
		String idxInput = scn.nextLine();
		// インデックスの入力が空ならプログラム終了
		if(!NullCheck.nullCheck(idxInput)) {
			System.out.println("入力が空だったのでプログラムを終了します");
			scn.close();
			return;
		}
		
		/** 入力された文字列をを解析してインデックスの配列にする */
		int[] idxList = parseIndexList(idxInput);
		// 文字列の解析に失敗した時はプログラム終了
		if(idxList == null) {
			System.out.println("ターゲットの特定に失敗したのでプログラムを終了します");
			scn.close();
			return;
		}
		
		/* ----------- 並び基準入力受付 ---------- */
		/** 並びの基準 */
		String rule;
		// 入力があるまで繰り返し
		do {
			System.out.println("昇順 / 降順を指定してください");
			rule = scn.nextLine();
		}while(!NullCheck.nullCheck(rule));
		
		// ルールの入力が不正な値ならプログラム終了
		if(!parseRule(rule)) {
			System.out.println("ソートルールの入力が不適正な値なのでプログラムを終了します");
			scn.close();
			return;
		}
		
		/* ----------- 処理 ---------- */
		// インデックスのリストをソート
		QuickSort.quickSort(idxList, 0, idxList.length - 1);
		// 降順が指定されていた場合は逆順に並び替え
		if(rule.equals("降順")) QuickSort.changeStandard(idxList);
		// 結果表示
		for(int i = 0; i < idxList.length; i++) {
			System.out.println();
			masterData[idxList[i]].printInfo();
		}
		scn.close();
	}
	
	/**
	 * マスターデータ作成
	 * @return 作成したデータ
	 */
	private static Prefecture[] createMasterData() {
		Prefecture[] dataAry = {
			new Prefecture("北海道", "札幌市", (double)83424),
			new Prefecture("青森県", "青森市", (double)9646),
			new Prefecture("岩手県", "盛岡市", (double)15275),
			new Prefecture("宮城県", "仙台市", (double)7282),
			new Prefecture("秋田県", "秋田市", (double)11638),
			new Prefecture("山形県", "山形市", (double)9323),
			new Prefecture("福島県", "福島市", (double)13784),
			new Prefecture("茨城県", "水戸市", (double)6097),
			new Prefecture("栃木県", "宇都宮市", (double)6408),
			new Prefecture("群馬県", "前橋市", (double)6362),
			new Prefecture("埼玉県", "さいたま市", (double)3798),
		};
		return dataAry;
	}
	
	/**
	 * 入力されたインデックス群の解析
	 * @param input 入力された文字列
	 * @return 整数の配列へ解析した入力文字列
	 */
	private static int[] parseIndexList(String input) {
		// カンマ区切りで文字列を分割
		String[] strIdxList = input.split(",");
		/** 解析したインデックスのリストを格納する変数 */
		int[] idxList;
		// 解析部分
		try {
			// 分割した文字列の数と同じ要素数で配列を作る
			idxList = new int[strIdxList.length];
			// 分割した文字ごとに解析処理
			for(int i  = 0; i < strIdxList.length; i++) {
				// 文字列を整数に変換して、返却用の配列へ格納
				idxList[i] = Integer.parseInt(strIdxList[i]);
			}
		// 入力文字列が数値へ変換できなかった場合の例外処理
		} catch (NumberFormatException e) {
			// エラーメッセージを表示
			System.out.println("入力されたインデックスの解析に失敗しました");
			// null を返却
			return null;
		}
		return idxList;
	}
	
	/**
	 * ソート順の解析
	 * @param rule 解析する入力文字列
	 * @return 解析結果：正常なら true
	 */
	private static boolean parseRule(String rule) {
		boolean result = false;
		if(rule.equals("昇順") || rule.equals("降順")) result = true;
		return result;
	}

}
