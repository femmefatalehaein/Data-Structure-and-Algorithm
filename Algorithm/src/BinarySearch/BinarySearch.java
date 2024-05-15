package BinarySearch;

public class BinarySearch {

	public static boolean isExist(int[] arr, int x) {
		//l�� ������ r�� ����
		int l = 0, r= arr.length-1;
		while(l<=r) {
			//��� ��.
			int m = (l+r)/2;
			//ã������ ���Ұ� �� ũ��.�������� m+1��
			if(arr[m]<x) {
				l = m+1;
			}
			//ã������ ���Ұ� �� �۴�. ������ m-1��
			else if(arr[m]>x) {
				r= m-1;
			}
			//�������-> ã�Ҵ�!
			else {
				return true;
			}
		}
		return false;
	}
}
