package SortingAlogorithm;

public class InsertionSort {
		
	public static void sortiByInsertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			//Ȯ���ϰ��� �ϴ� ����
			int target = arr[i];
			int j = i-1;
			//Ÿ���� ���� ���Һ��� ũ�� �� ���� �ݺ�
			while( j>=0 && target<arr[j] ) {
				arr[j+1] = arr[j]; //���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
				j--;
			}
			//while���� ���Դٴ°� ! Ÿ���� ���� ���Һ��� �۴ٴ� ��!
			arr[j+1] = target;
		}
	}

}
