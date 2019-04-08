package graveleff;

import java.util.Date;

/**
 *
 * @author gravel
 * @version 1.0
 *
 */
public class Test05 {

	public static void main(String[] aggs) {


//		//エポック秒の確認
//		long start = System.currentTimeMillis();
//
//		int[] nums = new int[] {1,2,3,4,4,5,5,6,7,8,8,8};
//
//		for(int i = 0; i < 1000000000; i++){
////			System.out.println(num);
//		}
//
//		//エポック秒の確認
//		long end = System.currentTimeMillis();
//
//		System.out.println("秒数" + (end - start));

		Date now = new Date();
		System.out.println("now = " + now);
		System.out.println("now.getTime = " + now.getTime());

		Date past = new Date(100);
		System.out.println("past = " + past);
		System.out.println("past.getTime() = " + past.getTime());

	}

}
