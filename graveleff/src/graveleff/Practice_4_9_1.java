package graveleff;

import java.util.Scanner;

public class Practice_4_9_1 {
	public static void main(String[] args){

		//練習４－１
		int[] point = new int[3];
		double[] weights = new double[4];
		boolean[] answers = new boolean[2];
		String[] namges = new String[2];

		//練習４－２

		int[] moneyList = new int[]{121902, 8302, 55100};

		int counter = 1;

//		// 通常For文
//		System.out.println("通常For文");
//		for(int counter2 = 1; counter2 <= moneyList.length; counter2++){
//			System.out.println(counter2 + "個目の要素 " + moneyList[counter2-1]);
//		}
//
//		System.out.println("");
//
//		// 拡張For文
//		System.out.println("拡張For文");
//		for (int money : moneyList){
//				System.out.println(counter + "個目の要素 " + money);
//				counter++;
//		}

		//練習４－３
		//5行目 NullPointerExcepotion

		//6行目 IndexArrayBoundsExcepotion

		//練習４－４
		System.out.println("数当てゲーム");
		System.out.println("");
		int[] numbers = new int[]{3,4,9};
		System.out.println("１桁の数字を入力 > ");

		Scanner scan = new java.util.Scanner(System.in);

		int inputNum = scan.nextInt();
		boolean result = false;

		for(int num : numbers ){
			if(num == inputNum){
				System.out.println("アタリ！");
				result = true;
				break;
			}
		}

		if(!result){
			System.out.println("ハズレ・・・");
		}

		scan.close();

	}

}
