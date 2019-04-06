package graveleff;

public class Practice_4_9 {
	/**
	 * @param agrs
	 */
	public static void main(String[] agrs) {

		/*
		 * //練習４－１ //① int[] ppint = new int[4];
		 *
		 * //② double[] weights = new double[5];
		 *
		 *
		 * //③ boolean[] answer = new boolean[3];
		 *
		 *
		 * //④ String[] names = new String[3];
		 */
		// 練習４－２
		// ①
		int[] moneyList = new int[] { 121902, 8302, 55100 };

		// ②
		System.out.println("４－２　②");
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		System.out.println();

		// ③
		System.out.println("４－２　③");
		for (int money : moneyList) {
			System.out.println(money);
		}

		// 練習４－３
		// ５行目 → NullPointerException
		// ６行目 → IndexArrayListException

		// 練習４－４

		int[] numbers = new int[] { 3, 4, 9 };
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int number : numbers) {
			if (number == input) {
				System.out.println("アタリ！");
				break;
			}
		}
		System.out.println("ゲーム終了");
	}

}
