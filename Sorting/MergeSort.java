class MergeSort{
	void merge(int left[], int right[], int arr[]){
		int i=0,j=0,k=0;
		int lenL = left.length;
		int lenR = right.length;
		while(i<lenL && j< lenR){
			if(left[i]<=right[j]){
				arr[k]=left[i];
				i++;
			}
			else{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<lenL){
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<lenR){
			arr[k]=right[j];
			j++;
			k++;
		}
	}
	void sort(int arr[])
	{
		int len = arr.length;
		if(len<2)
			return;
		int mid = len/2;
		int left[] = new int[mid];
		int right[] = new int[len-mid];
		for (int i=0; i<mid; i++){
			left[i]=arr[i];
		}
		for (int i=mid; i<length; i++){
			right[i-mid]=arr[i];
		}
		sort(left);
		sort(right);
		merge(left, right, arr);
	}
	public static void main(String arg[]){
		int array[] = {9,2,3,5,1,4,8,7};
		MergeSort obj = new MergeSort();
		obj.sort(array);
		for(int i=0;i<array.length;i++){
		System.out.print(array[i]+" ");	
		}
		System.out.println();
	}
}