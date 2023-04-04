package collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {

	private static final char[] obj1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(123);
		queue.add(234);
		queue.add(10);
		queue.add(50);
		queue.add(105);
		queue.add(1);
		System.out.println(queue.size());
		System.out.println(queue);
		
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
		for(Object obj : queue)
		{
			System.out.println(obj);
		}
		
		Iterator itr= queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(queue);
		
		System.out.println(queue.remove());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		Iterator itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println();
		queue.forEach(obj1 ->{
			System.out.println(obj1);
		});
	}

}
