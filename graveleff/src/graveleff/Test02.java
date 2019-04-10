package graveleff;

public class Test02 {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3 };
		int[] b;

		b = a;
		b[0] = 100;
		b[1] = 200;
		b[2] = 300;

		for (int value : b) {

			System.out.println(value);

		}

		int[] test = new int[] { 1, 2, 3, 4, 5, 5, 6, 7, 7, 8 };

		for (int val : test) {
			System.out.println(val);
		}

		StringBuilder test2 = new StringBuilder();
		StringBuilder newStr = test2.append("aaaaa");
		String newStr2 = newStr.append("bbbbbb").toString();

		System.out.println("newstr = " + newStr2);

	}

}