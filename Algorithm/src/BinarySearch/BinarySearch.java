package BinarySearch;

public class BinarySearch {

	public static boolean isExist(int[] arr, int x) {
		//l은 시작점 r은 끝점
		int l = 0, r= arr.length-1;
		while(l<=r) {
			//가운데 값.
			int m = (l+r)/2;
			//찾으려는 원소가 더 크다.시작점을 m+1로
			if(arr[m]<x) {
				l = m+1;
			}
			//찾으려는 원소가 더 작다. 끝점을 m-1로
			else if(arr[m]>x) {
				r= m-1;
			}
			//같은경우-> 찾았다!
			else {
				return true;
			}
		}
		return false;
	}
}
