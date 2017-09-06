package edu.usfca.cs.cs245;

/*
 * Algorithm for binary recursive search of a sorted array. 
 */
public class BinaryRecursiveSearch implements Practice2Search {
	public String searchName() {
		return "binary-recursive"; 
	}
	
	public int search(int[] arr, int target) {
		return search(arr,0, arr.length-1, target) ;
	}
	
	//helper method
	public int search(int [] arr, int start, int end, int target) { 
	
		if(end < start) {
			return -1;
		}
		if(start < end) {
			int mid = (start + end)/2;
			if (target < arr[mid]) {
				return search(arr, start, mid, target);
			} else if (target > arr[mid]) {
				return search(arr, mid+1, end, target);
			} else {
				return mid;
			}
		}
		return -1;
		
		
	} 
	
	
}
