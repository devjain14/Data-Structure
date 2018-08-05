import java.util.Scanner;
class FractionalKnap{
	public static void main(String arg[]){
		 int i,j=0,cap,n;  
        float sum=0,max;  
        Scanner sc = new Scanner(System.in);
        int array[][]=new int[2][20];  
        System.out.println("Enter no of items");  
        n=sc.nextInt(); 
 
        System.out.println("Enter the weights of each items");
        for(i=0;i<n;i++)  
            array[0][i]=sc.nextInt();    
 
        System.out.println("Enter the values of each items");
        for(i=0;i<n;i++)  
            array[1][i]=sc.nextInt(); 
 
        System.out.println("Enter maximum volume of knapsack :");  
        cap=sc.nextInt();

        while(cap>=0){
        	max = 0;
        	for(i=0;i<n;i++){
        		if((float)array[1][i]/(float)array[0][i] > max)
        		{
        			max = (float)array[1][i]/(float)array[0][i] ;
        			j=i;
        		}
        	}
    		if(array[0][j]>cap)
    		{
    			System.out.println("Quantity of item number: " +  (j+1) + " added is " +cap);  
    			sum += cap*max;
    			cap = -1;
    		}
    		else
    		{
    			System.out.println("Quantity of item number: " + (j+1) + " added is " + array[0][j]);
    			cap -= array[0][j];
    			sum += (float)(array[1][j]);
    			array[1][j] = 0;
    		}	
        }
        System.out.print("Total profit"+ sum);
	}
}