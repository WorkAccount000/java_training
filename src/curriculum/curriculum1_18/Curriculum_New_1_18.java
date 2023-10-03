package curriculum.curriculum1_18;
import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printHello(String str, int num) {
		System.out.println(str + " " + num);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void calcNum(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printNum(int[] nums) {
		for(int num: nums) {
			System.out.println(num);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void calcNum(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] returnNums(int num) {
		int[] nums = new int[num];
		Random rnd = new Random();
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
			System.out.println(nums[i]);
		}
		return nums;
	}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double printAvg(int[] nums) {
		int total = 0;
		double result;
		for(int num: nums) {
			total += num;
		}
		result = (double)total / (double)nums.length;
		System.out.println(result);
		return result;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean highAndLow(double num) {
		boolean result = false;
		if(num >= 50) result = true;
		return result;
	}
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
	printHello("Hello JavaSE", 11);
	calcNum(11, 3);
	printNum(new int[]{1, 2, 3, 4, 5, 6, 7});
	calcNum(12.8, 3.2);
	int[] q5ans = returnNums(3);
	double q6ans = printAvg(q5ans);
	boolean q7ans = highAndLow(q6ans);
	System.out.println(q7ans);
	}
	
}