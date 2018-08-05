import java.util.Stack;
class QbyStack{
	static class Queue{
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}
	void push(Stack<Integer> top, int data){
		top.push(data);
	}
	int pop(Stack<Integer> top){
		/*If stack is empty then error */
        if(top.isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(0);    
        }
        //pop the data from the stack
        return top.pop(); 
	}
	void enqueue(Queue q, int x){
		push(q.stack1, x);
	}
	int dequeue(Queue q){
		int x;
		//if boht st are empty then show error
		if(q.stack1.isEmpty() && q.stack2.isEmpty()){
			System.out.println("Q is empty");
			System.exit(0);
		}
		//Move elements from st1 to st2 ony if st2 is empty
		if(q.stack2.isEmpty()){
			while(!q.stack1.isEmpty()){
				x=pop(q.stack1);
				push(q.stack2, x);
			}
		}
		x= pop(q.stack2);
		return x;
	} 
	public static void main(String atg[]){
		Queue q = new Queue();
		q.stack1 = new Stack<>();
		q.stack2 = new Stack<>();
		enqueue(q,1);
	}
}