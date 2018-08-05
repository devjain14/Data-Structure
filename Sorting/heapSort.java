class heapSort{
	void sort(int arr[]){
		int n = arr.length;
		//build max heap
		for(int i=n/2-1;i>=0;i--){
			heapify(arr,n,i);
		}
		//heap sort
		for(int i=n-1;i>=0;i--){
			int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
			//hepaify root element
			heapify(arr, i, 0);
		}
	}
	void heapify(int arr[], int n, int i){
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		//to find largest among root, left and right child
		if(l<n && arr[l]>arr[largest])
			largest = l;
		if(r<n && arr[r]>arr[largest])
			largest = r;
		//swap root and largest
		if(largest!=i)
		{
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			heapify(arr, n, largest);
		}
	}
	public static void main( String ag[]){
        int arr[] = {1,12,9,5,6,10};
        int n = arr.length;
        heapSort hs = new heapSort();
        hs.sort(arr);
 
        System.out.println("Sorted array is");
        for(int i=0;i<n;i++){
        	System.out.println(arr[i]+" ");
        }
        
    }
}