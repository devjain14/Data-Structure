import java.util.*;
class Stack{
	int top;
	int a[] = new int[1000];
	Stack()
	{
		top = -1;
	}
	 boolean isEmpty()
    {
        return (top < 0);
    }
	void push(int x){
		if(top>=1000){
			System.out.println("Stack Overflow");
		}
		else{
			a[++top]=x;
		}
	}
	int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int x = a[top--];
			return x;
		}
	}
	public static void main(String arg[]){
		Stack st = new Stack();
		st.push(10);
		st.push(15);
		st.push(2);
		st.pop();
		st.push(4);
		// For printing the elements of stack
		while (!st.isEmpty()) //check until top becomes < 0
		{
		    System.out.println(st.pop());
		}
	}
}