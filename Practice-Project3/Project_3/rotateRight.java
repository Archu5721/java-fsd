package Project_3;

import java.util.Arrays;

public class rotateRight {
	public static void main(String[] args) {
		int arr[]= {1,3,9,2,8,20,40,50,20}; 
		int len = arr.length;
		int n=5;
		
		for(int j=1;j<=n;j++) {
			int temp = arr[len-1];
			for(int i=len-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		System.out.println(Arrays.toString(arr));
	
	}
}
