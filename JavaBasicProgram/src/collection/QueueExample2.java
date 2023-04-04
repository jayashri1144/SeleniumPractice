package collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new PriorityQueue();
		System.out.println(queue);
		System.out.println(queue.size());
		// peek() returns top most element of the queue, if the queue if empty dn it
				// will return 'null' instead of throwing exception
				System.out.println("head element of the queue using peek():" + queue.peek());
				// element() returns top most element of the queue, if the queue if empty dn it
				// will throw an exception by name 'NoSuchElementException'
				System.out.println("head element of the queue using element():" + queue.element());
	}

}
