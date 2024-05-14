package simpleSortingAlogorithm;

public class SelectionSort {
	
	public static void swap(int[] arr, int idx1, int idx2){
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	public static void sortBySelectionSort(int[] arr) {
	
		for(int i=0; i<arr.length-1; i++) {
			int minIdx = i;
			//최솟값 찾기 for문
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] <arr[minIdx]) {
					minIdx = j;
				}
			}
			swap(arr, i, minIdx);
		}
	}

}
