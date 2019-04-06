package graveleff;

public class Test03 {
	public static void main(String[] agrs) {

		int[][] score = new int[3][3];

		score[0][0] = 10;
		score[0][1] = 20;
		score[0][2] = 30;

		score[1][0] = 11;
		score[1][1] = 21;
		score[1][2] = 31;

		score[2][0] = 12;
		score[2][1] = 22;
		score[2][2] = 32;

		System.out.println(score.length);
		System.out.println(score[0].length);
		System.out.println(score[1].length);
		System.out.println(score[2].length);

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.println(score[i][j]);
			}
			System.out.println();

		}

	}

}

