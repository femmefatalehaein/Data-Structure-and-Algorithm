package SortingAlogorithm;

public class BubbleSort {
	
	public static void swap(int[] arr, int idx1, int idx2){
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	public static void sortByBubbleSort(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = 0; j < arr.length - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                swap(arr, j, j + 1);
	            }
	        }
	    }
	}

}
