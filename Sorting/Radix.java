import java.util.*;
class Radix{
	static int getMax(int arr[], int n){
		int max=0;
		for(int i=0;i<n;i++){
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	static void sort(int arr[], int n, int exp){
		int output[] = new int[n];
		int count[] = new int [10];
		// for(int i =0 ;i<n;i++){
		// 	count[i]=0;
		// }		
		// DO the same work of assigning 0 to all elemnts of array
		Arrays.fill(count, 0);
		//
		for(int i=0;i<n;i++){
			count[(arr[i]/exp)%10]++;
		}
		//
		for(int i=1;i<10;i++){
			count[i] += count[i-1];
		}
		for(int i=n-1;i>=0;i--){
			output[count[(arr[i]/exp)%10] - 1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++){
			arr[i] = output[i];
		}
	}
	static void radixSort(int arr[], int n){
		int max = getMax(arr,n);
		for(int exp=1;max/exp>0;exp*=10)
			sort(arr,n, exp);
	}
	 public static void main (String[] args)
    {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        radixSort(arr, n);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+"  ");
    }
    }
}