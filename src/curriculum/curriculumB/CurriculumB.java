package curriculum.curriculumB;
import java.util.Random;
import java.util.Scanner;


public class CurriculumB {

	public static void main(String[] args) {
		
		/* ---------- ユーザー名登録部分 ---------- */
		// 入力用の Scanner のインスタンスを作成
		Scanner scn = new Scanner(System.in);
		/** 入力格納用の変数 */
		String usrName;
		/** バリデーションのチェックと繰り返し制御用の変数 */
		boolean validCheck = false;
		// 正常な入力が行われるまで繰り返し
		do {
			// 入力受付
			usrName = scn.nextLine();
			// バリデーションチェック
			validCheck = Validation.validation(usrName);
			// チェックに通るまで入力繰り返し
		} while (!validCheck);
		// 登録メッセージ表示
		System.out.printf("ユーザー名「%s」を登録しました\n", usrName);

		
		/* ---------- じゃんけん部分 ---------- */
		/** 乱数生成するためのインスタンス */
		Random rnd = new Random();
		/** 自身の手を決定する整数 */
		int selfOpe;
		/** 相手の手を決定する整数 */
		int enemOpe;
		/** 繰り返しを制御するための変数 */
		boolean loop;
		/** 繰り返し回数カウント用変数 */
		int count = 0;
		
		// じゃんけんで勝つまでループ
		do {
			// 自身と相手の手を乱数で決定
			selfOpe = rnd.nextInt(3);
			enemOpe = rnd.nextInt(3);
			// じゃんけんの勝敗によって繰り返し制御変数の値を決める
			loop = Janken.play(usrName, selfOpe, enemOpe);
			// 繰り返し回数のカウント
			count++;
		} while (!loop);
		
		// 繰り返した回数を表示
		System.out.printf("勝つまでにかかった合計回数は%d回です\n", count);
		
		
		/* ---------- for 部分 ---------- */
		System.out.println();
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j != 1) System.out.print(" || ");
				System.out.printf("%02d * %02d = %02d", i, j, i * j);
			}
			System.out.println();
		}

		System.out.println();
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= 20; j++) {
				if(j != 1) System.out.print(" || ");
				System.out.printf("%03d * %03d = %03d", i, j, i * j);
			}
			System.out.println();
		}
		

		/* ---------- 在庫表示部分 ---------- */
		/* 
		 * 入力回数の縛りはないと問題文にありますが、繰り返しの終了条件が明言されていないので、
		 * "終了" と入力すると在庫確認プログラムを終了することとします。
		 */
		/** 入力の区切り文字 */
		String delimiter = "、";
		/** 区切り文字で区切った入力の値を格納する配列 */
		String[] product;
		/** 繰り返し制御用変数 */
		boolean nextLoop = true;
		do {
			System.out.println("在庫を確認したい商品を句読点(、)区切りで入力してください");
			System.out.println("\"終了\" と入力されると在庫確認を終了します");
			// 入力を区切り文字で区切って配列に格納
			product = scn.nextLine().split(delimiter);
			// 入力された中に "終了" の文字があれば繰り返し制御変数の値を変更
			for(String word: product) {
				if(word.equals("終了")) nextLoop = false;
			}
			// 繰り返しが続くなら在庫表示
			if (nextLoop) {
				/** 在庫管理クラスのインスタンス化 */
				StockManage stockMng = new StockManage (product);
				// 在庫表示
				stockMng.stockPrint();
			}
		} while(nextLoop);
		
		/* ---------- 成績管理部分 ---------- */
		Student[] students = createStudentsData();
		calcStudentsData(students);
		
		// Scanner インスタンスを閉じる
		scn.close();
	}
	
	/**
	 * 生徒のデータを標準入力から作成する
	 * @return 作成した生徒のデータの配列
	 */
	private static Student[] createStudentsData() {
		/** 標準入力を受け取るためのインスタンス */
		Scanner scn = new Scanner(System.in);
		/** データ作成する人数を入力から受け取るための変数 */
		int num;
		// データを作成する人数を受付
		System.out.print("生徒の人数を入力してください（2以上）：");
		num = scn.nextInt();
		/** 指定された人数分のデータを格納する配列 */
		Student[] students = new Student[num];
		/** 扱う教科の配列 */
		String[] subject = {"英語", "数学", "理科", "社会"};
		// 人数分の繰り返し
		for(int i = 0; i < students.length; i++) {
			/** Student インスタンスのコンストラクタに渡すための点数の配列 */
			int[] score = new int[4];
			// コンソールの表示ライン調整のための空行出力
			System.out.println();
			// 教科分入力繰り返し
			for(int j = 0; j < subject.length; j++) {
				// 各生徒の教科毎の点数入力受付
				System.out.printf("%d人目の『%s』の点数を入力してください :", i + 1, subject[j]);
				score[j] = scn.nextInt();
			}
			// 作成した点数の配列を使って Student クラスのインスタンスを配列に格納
			students[i] = new Student(score);
		}
		// Scanner インスタンスを閉じる
		scn.close();
		return students;
	}
	
	/**
	 * 生徒のデータの配列から各種平均点を計算し、表示する
	 * @param students 生徒のデータの配列
	 */
	private static void calcStudentsData(Student[] students) {
		/** 扱う教科の配列 */
		String[] subject = {"英語", "数学", "理科", "社会"};
		/** 教科毎の合計点を格納する配列 */
		int[] totalList = new int[5];
		/** 教科毎の平均点を格納する配列 */
		double[] avgList = new double[5];
		// 生徒数分繰り返し
		for(int i = 0; i < students.length; i++) {
			// 各生徒の平均点出力
			System.out.printf("%d人目の平均点は%.2f点です\n", i + 1, students[i].getAvg());
			/** 教科毎の点数の配列 */
			int[] scoreList = students[i].getScoreList();
			// 各教科と全部の合計点を加算していく
			totalList[0] += scoreList[0];
			totalList[1] += scoreList[1];
			totalList[2] += scoreList[2];
			totalList[3] += scoreList[3];
			totalList[4] += students[i].getTotal();
		}
		// 各教科と全体の平均点を算出
		avgList[0] = (double)totalList[0] / students.length;
		avgList[1] = (double)totalList[1] / students.length;
		avgList[2] = (double)totalList[2] / students.length;
		avgList[3] = (double)totalList[3] / students.length;
		avgList[4] = (double)totalList[4] / (students.length * 4);
		// 教科分の平均点を出力
		for(int i = 0; i < subject.length; i++) {
			System.out.printf("%sの平均点は%.2f点です\n", subject[i], avgList[i]);
		}
		// 全体の平均点を出力
		System.out.printf("全体の平均点は%.2f点です\n", avgList[4]);
	}
}
