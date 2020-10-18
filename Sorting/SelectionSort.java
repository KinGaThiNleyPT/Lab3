// Java program for implementation of Selection Sort 
class SelectionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int pt = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[pt]) 
					pt = j; 

			// Swap the found minimum element with the first 
			// element 
			int temp = arr[pt]; 
			arr[pt] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {64,25,12,22,11}; 

		System.out.print("UnSorted: ");
		System.out.print("\n");

		for (int i = 0; i < arr.length; i++ ) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		
		ob.sort(arr); 
		System.out.println("Sorted: "); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra*/
