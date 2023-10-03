package curriculum.curriculumA;

public class CurriculumA {

	public static void main(String[] args) {
		// 1.ローカル変数宣言
		byte by;
		short sh;
		int n;
		long lon;
		float flt;
		double dou;
		char ch;
		String str;
		boolean bool;
		
		// 2.変数に初期値代入
		by = 0;
		sh = 0;
		n = 0;
		lon = 0;
		flt = 0.0f;
		dou = 0.0;
		ch = '\u0000';
		str = null;
		bool = false;
		
		// 3.変数に値代入
		by = 10;
		sh = 100;
		n = 1000;
		lon = 10000;
		flt = 9.5f;
		dou = 10.5;
		ch = 'a';
		str = "ハロー";
		bool = true;
		
		// 4.出力
		System.out.println("問4.出力");
		System.out.println(lon + n + sh + by);
		System.out.println((int)(flt + dou));
		System.out.println(ch + " " + str + " " + bool);
		System.out.println((int)(lon + n + sh + by + flt + dou));
		System.out.println(lon * n * sh * by);
		System.out.println(dou / sh);
		System.out.println(by - sh);
		
		// 5.プログラム修正
		System.out.println();
		System.out.println("問5.プログラム修正");
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA" + (num+num1));
		
		// 6.format に従った出力
		System.out.println();
		System.out.println("問6.format に従った出力");
		String name = "山田太郎";
		int age = 18;
		float height = 170.5f;
		float weight = 62.2f;
		String food = "寿司";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		// 7.BMI 計算
		System.out.println();
		System.out.println("問7.BMI 計算");
		System.out.printf("BMIは%.2fです\n", weight / ((height / 100) * (height / 100)));
		
		// 8.人物情報再代入
		System.out.println();
		System.out.println("問8.人物情報再代入");
		name = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		food = "オムライス";
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.printf("BMIは%.2fです\n", weight / ((height / 100) * (height / 100)));
		
		// 9.加算代入演算子
		System.out.println();
		System.out.println("問9.加算代入演算子");
		age += age;
		height += height;
		weight += weight;
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		System.out.printf("BMIは%.2fです\n", weight / ((height / 100) * (height / 100)));
		
		// 10.条件判定
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		System.out.println();
		System.out.println("問10.条件判定");
		System.out.println(age >= 25 ? true : false);
		
		// 11.キャスト(数値 -> 文字列)
		System.out.println();
		System.out.println("問11.キャスト(数値 -> 文字列)");
		String ageStr = Integer.valueOf(age).toString();
		String heightStr = Float.valueOf(height).toString();
		String weightStr = Float.valueOf(weight).toString();
		System.out.println(ageStr + heightStr + weightStr);
		
		// 12.キャスト(文字列 -> 数値)
		System.out.println();
		System.out.println("問11.キャスト(文字列 -> 数値)");
		int ageInt = Integer.parseInt(ageStr);
		int heightInt = (int)Double.parseDouble(heightStr);
		System.out.println(ageInt);
		System.out.println(heightInt);
		
		// 13.複数条件判定
		System.out.println();
		System.out.println("問13.複数条件判定");
		System.out.println(age >= 25 || height >= 160 ? true : false);
	}

}
