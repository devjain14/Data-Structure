class BinarySearch{
	static int findIndexOf(int arr[],int start, int end, int num){
		int mid = (start+end) / 2;
		if(num>arr[mid]){
			start = mid+1;
			return findIndexOf(arr, start, end, num);
		}
		else if(num<arr[mid]) {
			end = mid;
			return findIndexOf(arr, start, end, num);
		}
		else
			return mid;
	}
	public static void main(String arg[]){
		int arr[] = {1, 4, 7, 24, 43, 54, 67, 90, 98, 99};
		int index;
		int num = 98;
		index = findIndexOf(arr, 0, 9, num);
		System.out.println("Index of "+num+" is "+index);
	}
}