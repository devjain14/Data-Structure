import java.util.Queue;
import java.util.LinkedList;
class StackbyQ{
	Queue<Integer> q = new LinkedList<Integer>();
	void push(int val){
		int size = q.size();
		//Add current element
		q.add(val);
		//pop all previous  elements and put them after current elem
		for(int i=0;i<size;i++){
			int x = q.remove();
			q.add(x);
		}
	}
	//return top element
	int pop()
	{
		if(q.isEmpty())
		{
			System.out.println("NO elements");
			return -1;
		}
		int x = q.remove();
		return+ x;
	}	
	//return top of stack
	int top()
	{
		if(q.isEmpty())
			return -1;
		return q.peek();
	}
	boolean isEmpty(){
		return q.isEmpty();
	}
	public static void main(String atg[]){
		StackbyQ s =new StackbyQ();
		s.push(10);
		s.push(13);
		s.push(20);
		System.out.println("top is: "+ s.top());
		s.pop();
   		System.out.println("top is: "+ s.top());
	}
}