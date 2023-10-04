package curriculum.curriculum1_28.processing;

public class QuickSort {
	
	/**
	 * 配列の要素を入れ替える
	 * @param ary 操作する配列
	 * @param i 入れ替えをする要素
	 * @param j 入れ替えをする要素
	 */
	private static void swap (double[] ary, int i, int j) {
		double tmp = ary[i];
		ary[i] = ary[j];
		ary[j] = tmp;
	}
	
	/**
	 * 基準値を使った大小の並び替え
	 * @param ary 操作する配列
	 * @param start 操作範囲の最初のインデックス
	 * @param end 操作範囲の最後のインデックス
	 * @return 並び替えを行った時の最終的なピボットのインデックス
	 */
	private static int partition(double[] ary, int start, int end) {
		// 右端の要素をピボットとする
		double pivot = ary[end];
		// ピボットの最終的な位置を示すためのインデックス
		int pIdx = start;
		// 操作範囲内でピボットの値よりも小さい要素を左に寄せていく
		for(int i = start; i < end; i++) {
			// 現在のインデックスを持つ要素がピボットよりも小さければ
			if(ary[i] <= pivot) {
				// 現在のピボットインデックスと小さい要素の位置を入れ替え
				swap(ary, i, pIdx);
				// 小さい要素を寄せたぶんピボットインデックスをインクリメント
				pIdx++;
			}
		}
		
		// 最終的に決定したピボットインデックスのいちにピボットとした値を持ってくる
		swap(ary, end, pIdx);
		// ピボットインデックスを返却
		return pIdx;
	}
	
	public static void quickSort(double[] ary, int start, int end) {
		// 操作範囲が1要素以下ならメソッド終了
		if(start >= end) return;
		
		// 最初のピボット位置を決める
		int pivot = partition(ary, start, end);
		// ピボットよりも小さい範囲でソート繰り返し
		quickSort(ary, start, pivot - 1);
		// ピボットよりも大きい範囲でソート繰り返し
		quickSort(ary, pivot + 1, end);
	}
	
	/**
	 * 配列を逆順に並び替え
	 * @param ary 並び替える配列
	 */
	public static void changeStandard(double[] ary) {
		/** 入れ替え回数 */
		int numOfChange = ary.length % 2 == 0 ? ary.length / 2 : (ary.length - 1) / 2;
		/** 入れ替え回数分両端からペアにして入れ替え */
		for(int i = 0; i < numOfChange; i++) swap(ary, i, ary.length - 1 - i);
	}

}
