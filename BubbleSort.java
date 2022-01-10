package com.sushim.dsaa;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author Sushim_Saini
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int data[] = { 60, 91, 40, 30, 50, 10, 71, 20, 90, 80 };

		int finalData[] = new int[data.length];

		for (int j = data.length; j > 0; j--) {
			data = extracted(Arrays.copyOfRange(data, 0, j));
			finalData[j - 1] = data[j - 1];
		}
		System.out.println(Arrays.toString(finalData));
	}

	private static int[] extracted(int[] data) {
		int placeHolder;
		int lenght = data.length;
		for (int i = 0; i < lenght; i++) {
			if (i < lenght - 1 && data[i] > data[i + 1]) {
				placeHolder = data[i + 1];
				data[i + 1] = data[i];
				data[i] = placeHolder;
			}
		}
		return data;
	}

}
