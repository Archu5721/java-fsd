package Project_3;

class smallElement{
	
	public static int partition(int[] arr, int l,
								int r)
	{
		int x = arr[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= x) {
				// Swapping arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
			}
		}

		// Swapping arr[i] and arr[r]
		int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;

		return i;
	}

	
	public static int kthSmallest(int[] arr, int l,int r, int k)
	{
		
		if (k > 0 && k <= r - l + 1) {
			
			int pos = partition(arr, l, r);

			
			if (pos - l == k - 1)
				return arr[pos];

			
			if (pos - l > k - 1)
				return kthSmallest(arr, l, pos - 1, k);

			
			return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
		}
		return Integer.MAX_VALUE;
	}

	// Driver program to test above methods
	public static void main(String[] args)
	{
		int arr[] = new int[] { 12, 3, 5, 7, 4, 19, 26 };
		int k = 3;
		System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
	}
}



