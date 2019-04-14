package graveleff;

class Capter5_8 {
	public static void main(String[] args){

		introduceOneself();

		String title = "SMTPのメール送信テスト";
		String address = "hogehoge@test,co.jp";
		StringBuilder strb = new StringBuilder();
		strb.append("こんには\n");
		strb.append("ホゲホゲ\n");
		strb.append("ほげほげ\n");
		strb.append("ほげほーげ\n");

		System.out.println("メール送信テスト：１通目");
		email(title, address, strb.toString());
		System.out.println("");

		System.out.println("メール送信テスト：２通目");
		email(address, strb.toString());
		System.out.println("");


		System.out.println("三角形の面積");
		System.out.println("長さ10cm、高さ5cm = " + calcTriangleArea(10, 5.0));
		System.out.println("");

		System.out.println("円の面積");
		System.out.println("半径5.0cm = " + calcCircleArea(5.0));
		System.out.println("");

	}


	public static void introduceOneself(){

		String name = "gravel eff";
		int age = 20;
		int height = 170;
		char sex = '0';

		System.out.println("氏名は" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "です");

		if(sex == '0'){
			System.out.println("性別は" + "男性" + "です");
		}
		else if (sex == '1'){
			System.out.println("性別は" + "女性" + "です");
		}
		else{
			System.out.println("性別は" + "？？" + "です");
		}

		System.out.println("");

	}


	public static void email(String title, String address, String text){
		System.out.println("「" + address + "」に以下のメールを送信しました");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
	}

	public static void email(String address, String text){
		email("無題", address, text);
	}

	public static double calcTriangleArea(double bottom, double height){
		double ans = 0;

		ans = (bottom * height) / 2;

		return ans;
	}

	public static double calcCircleArea(double radius){
		double ans = 0;

		ans = radius * radius * 3.14;

		return ans;
	}

}
