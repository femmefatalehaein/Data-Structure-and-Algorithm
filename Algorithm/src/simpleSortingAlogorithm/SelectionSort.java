package simpleSortingAlogorithm;

public class SelectionSort {
	
	public static void swap(int[] arr, int idx1, int idx2){
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	public static void sortBySelectionSort(int arr[]) {
		//targetIdx = i (최솟값이 위치할 자리!)
		for(int i=0; i<arr.length-1; i++) {
			int minIdx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIdx]>arr[j]){
					minIdx = j;
				}
			}
			swap(arr,i,minIdx);
		}
		
		
	}

}
