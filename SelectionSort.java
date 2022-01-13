/**
 * 
 */
package com.sushim.dsaa;

import java.util.Arrays;

/**
 * @author Sushim_Saini
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int data[] = { 60, 91, 40, 30, 50, 10, 71, 20, 90, 80 };
		int lenght = data.length;
		for(int i=0; i<lenght-1;i++ ) {
			int minIndex=i;
			for(int j=minIndex+1;j<lenght-1;j++) {
				if(data[j]<data[minIndex]) {
					int temp = data[j];
					data[j] = data[minIndex];
					data[minIndex]=temp;
					minIndex = j;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}

}
