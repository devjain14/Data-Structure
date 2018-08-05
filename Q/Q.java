import java.util.*;
class Q{
	int front,rear,size,capacity;
	int arr[];
	public Q(int cap){
		capacity = cap;
		size=0;
		front = 0;
		rear = capacity-1;
		arr = new int[capacity];
	}
	boolean isFull()
	{
		return(size==capacity);
	}
	boolean isEmpty()
	{
		return(size==0);
	}
	void enqueue(int x){
		if(isFull())
			return;
		rear = (rear+1)%capacity;
		arr[rear] = x;
		size = size+1;
	}
	int dequeue(){
		if(isEmpty())
			return Integer.MIN_VALUE;
		int x  = arr[front];
		front = (front +1)%capacity;
		size = size-1;
		return x;
	}
	//To print the front
	int front(){
		if (isEmpty())
        return Integer.MIN_VALUE;
    return arr[front];

	}
	int rear(){
		if(isEmpty())
		return Integer.MIN_VALUE;
	return arr[rear];
	}
	public static void main(String arg[]){
		Q qu = new Q(100);
		qu.enqueue(10);
		qu.enqueue(15);
		qu.enqueue(13);
		qu.dequeue();
		qu.dequeue();
		qu.enqueue(38);
		qu.enqueue(2);
		System.out.println("Front Element is: "+ qu.front());
		System.out.println("Rear Element is: "+ qu.rear());
	}

}