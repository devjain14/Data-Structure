import java.util.Stack;
class QueueByStack{
	Stack<Integer> a = new Stack<Integer>();
	Stack<Integer> b = new Stack<Integer>();
	void enqueue(int x){
		a.push(x);
	}
	int dequeue(){
		if(b.isEmpty()){
			while(!a.isEmpty()){
				b.push(a.pop());
			}
		}
		return b.pop();
	}
	public static void main(String arg[]){
		QueueByStack q = new QueueByStack();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}