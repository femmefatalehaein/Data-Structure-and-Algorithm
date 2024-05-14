package simpleSortingAlogorithm;

public class BubbleSort {
	
	public static void swap(int[] arr, int idx1, int idx2){
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	public static void bubbleSort(int arr[]) {
		//뒤에서 두번째 원소까지
		for (int i=0; i<arr.length-1; i++) {
			//i와 j는 대칭이 되는 것. (i+j = arr.length-1)
			for (int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		
	}

}
