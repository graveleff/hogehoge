package graveleff;

public class Test02 {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3 };
		int[] b;

		b = a;
		b[0] = 100;
		b[1] = 200;
		b[2] = 300;

		for (int value :b){

			System.out.println(value);

		}

	}

}