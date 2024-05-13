package SortingAlogorithm;

public class InsertionSort {
		
	public static void sortiByInsertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			//확인하고자 하는 원소
			int target = arr[i];
			int j = i-1;
			//타겟이 이전 원소보다 크기 전 까지 반복
			while( j>=0 && target<arr[j] ) {
				arr[j+1] = arr[j]; //이전 원소를 한 칸씩 뒤로 미룬다.
				j--;
			}
			//while문을 나왔다는것 ! 타겟이 이전 원소보다 작다는 것!
			arr[j+1] = target;
		}
	}

}
