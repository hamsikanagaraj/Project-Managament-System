import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {
		
		Queue<String> que=new LinkedList<String>();
		que.offer("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		
		System.out.println(que.peek());
		
		while(!que.isEmpty())
			System.out.println(que.poll());
		
		Deque<String> dq = new LinkedList<String>();

        dq.offerLast("Alfa");
        dq.offerLast("Beta");
        dq.offerLast("gama");

        while (!dq.isEmpty())
            System.out.println(dq .pollFirst());
	}

}
