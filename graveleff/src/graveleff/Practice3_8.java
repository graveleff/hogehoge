package graveleff;

import java.util.Random;

public class Practice3_8 {

	public static void main(String[] args){

		//練習３－１
		/*
		 * ①weight == 60
		 * ②(age1 + age2)*2 > 60
		 * ③age%2 == 1
		 * ④name.equals("瀧")
		 * */


		//練習３－２
		/*
		 * C、D、E
		 *
		 * */


		//練習３－３

		int seibetsu;
		int age;
		seibetsu = 1;
		age = 40;


		System.out.println("こんにちは。");

		if(seibetsu == 0){
			System.out.println("私は男です。");
		}
		else{
			System.out.println("私は女です。");
		}
		if(seibetsu == 0){
			System.out.println(age + "歳です。");
		}

		System.out.println("よろしくお願いします。");

		//練習３－４
		/*
		 * else句の後のには１つしかステートメント書けない
		 *
		 * こう直す
		 *
		 * else{
		 * 	System.out.println("DVDを見ます");
		 *  System.out.println("寝ます");
		 * }
		 *
		 * */

		//練習３－５
//		System.out.println("[メニュー] 1:検索、2:登録、3:削除、4変更:>");
//
//		int selected = new java.util.Scanner(System.in).nextInt();
//
//		switch(selected){
//		case 1:
//			System.out.println("検索します");
//			break;
//		case 2:
//			System.out.println("登録します");
//			break;
//		case 3:
//			System.out.println("削除します");
//			break;
//		case 4:
//			System.out.println("変更します");
//			break;
//		}

		//練習３－６
//		System.out.println("【数あてゲーム】");
//		Random random = new Random();
//		int ans = random.nextInt(5);
//		System.out.println(" ans = " + ans);
//
//		for (int i = 0; i < 5; i++){
//			int num = new java.util.Scanner(System.in).nextInt();
//
//			if(num == ans){
//				System.out.println("アタリ！");
//				System.out.println("num = " + num + " ans = " + ans);
//
//				break;
//			}
//			else{
//				System.out.println("違います");
//			}
//
//			System.out.println("ゲームを終了します。");
//		}

	    Random value = new Random();

	    System.out.println(value.nextInt(1000));

//	    Scanner scan = new Scanner(System.in);
//
//	    int val = scan.nextInt();
//	    System.out.println("最初の数値のトークンは: "+ val);
//
//	    val = scan.nextInt();
//	    System.out.println("次の数値のトークンは  : "+ val);

	}

}
