// Java program for implementation of Insertion Sort 
class Insertion{ 
	/*Function to sort array using insertion sort*/
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int temp = arr[i]; 
			int j = i - 1; 

			/* Move elements of arr[0..i-1], that are 
			greater than temp, to one position ahead 
			of their current position */
			while(j >= 0 && arr[j] > temp)
			{ 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = temp; 
		} 
	} 

	/* A function  to print array of size n*/
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
	} 

	// main method 
	public static void main(String args[]) 
	{ 
		int arr[] = { 7, 5, 2, 3, 9 }; 

		Insertion obj = new Insertion(); 
		System.out.print("Unsorted: ");

		for(int e=0; e<arr.length; e++)
		{
			System.out.print(arr[e]+" ");
		}
		System.out.print("\n");

		System.out.print("Sorted: ");
		obj.sort(arr); 
		printArray(arr); 
	} 
}
