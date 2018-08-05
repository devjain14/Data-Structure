class InsertionSort{
	void sort(int arr[]){
		int len  = arr.length;
		for(int i = 1; i<len; i++){
			int j=i-1;
			int key = arr[i];
			//Move each greater elemnt than key, one pos ahead
			while(j>=0 && key<arr[j]){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String arg[]){
		int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
		for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");	
		}
		System.out.println();
	}
}