package curriculum.curriculum1_23;

public class Curriculum23 {

	public static void main(String[] args) {
		Animal anim = new Animal();
		anim.setClassName("ライオン");
		anim.setLength(2.1);
		anim.setSpeed(80);

		System.out.printf("動物名：%s\n", anim.getClassName());
		System.out.printf("体長：%.1fm\n", anim.getLength());
		System.out.printf("速度：%dkm/h\n", anim.getSpeed());
	}

}
