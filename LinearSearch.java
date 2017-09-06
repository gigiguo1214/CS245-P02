package edu.usfca.cs.cs245;
/*
 * Algorithm for linear search of a sorted array.
 * @Gigi Xiaowan Guo 
 */

public class LinearSearch implements Practice2Search {
	public String searchName() { 
		return "linear";
				
	}
	
	public int search(int [] arr, int target) {
		int arrSize = arr.length;
		for (int i = 0; i < arrSize; i++) {
			if (arr[i] == target) {
			return i;
			}
		}
		return -1;
	}
	
}
