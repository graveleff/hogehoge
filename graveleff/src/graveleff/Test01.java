package graveleff;

public class Test01 {
	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if ((i + 1) * (j + 1) > 10 && (i + 1) * (j + 1) < 50) {
					System.out.println("continue ... " + ((i + 1) * (j + 1)));
					continue;
				} else if ((i + 1) * (j + 1) > 50) {
					System.out.println("break ... " + ((i + 1) * (j + 1)));
					break;
				}
				// コメントを追加
				System.out.println((i + 1) + "×" + (j + 1) + "＝" + ((i + 1) * (j + 1)));
			}
			System.out.println();
		}

	}

}
