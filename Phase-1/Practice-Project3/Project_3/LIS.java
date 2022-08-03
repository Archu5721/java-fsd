package Project_3;

import java.util.Scanner;

public class LIS {
	
	int lenFind(int arr[],int num) {
		int val[] = new int[num];
		val[0] = 1;
		int max=0;
		for(int i=1;i<num;i++) {
			val[i] = 1;
			for(int j=0;j<i;j++) {
				if ( arr[i] > arr[j] && val[i] <= val[j]) 
					val[i] = val[j] + 1;
			}	
		}
		for (int i = 0; i < num; i++)
            if (max < val[i])
                max = val[i];
 
        return max;
}
	public static void main(String[] args) {
		int a[] = new int[50];
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		n = scanner.nextInt();
		for (int i=0; i<n ; i++) {
			 a[i]= scanner.nextInt();
		}
		LIS lis = new LIS();
		
		System.out.println("Longest Increasing Subsequence : " + lis.lenFind(a,n));
	}
	
}
