package curriculum.curriculumB;
import java.util.Random;

/**
 * 与えられた商品の在庫管理を行うクラス
 */
public class StockManage {
	/* ----------- フィールド ---------- */
	/** 商品名の配列 */
	private String[] productList;
	
	
	/* ----------- コンストラクタ ---------- */
	public StockManage(String[] list) {
		this.productList = list;
	}
	
	
	/* ----------- メソッド ---------- */
	/**
	 * 在庫数を表示
	 */
	public void stockPrint() {
		/** 在庫数 */
		int stock;
		/** 乱数生成用インスタンス */
		Random rnd = new Random();
		// 扱う商品数分繰り返し
		for(String product: this.productList) {
			// 現在の商品で分岐処理
			switch(product) {
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					// 在庫数を決定して表示
					stock = rnd.nextInt(12);
					System.out.printf("%sの残り台数は%d台です\n", product, stock);
					break;
				case "テレビ":
				case "ディスプレイ":
					// 在庫数を決定して表示
					stock = product == "テレビ" ? rnd.nextInt(12) : 11 - rnd.nextInt(12);
					System.out.printf("%sの残り台数は%d台です\n", product, stock);
					break;
				default:
					// 取り扱える商品名ではない場合メッセージ表示
					System.out.printf("『%s』は指定の商品ではありません\n", product);
			}
		}
	}
}
