package queue;

public class QueueMainClass {

	public static void main(String[] args) {
		
		MyQueue mq = new MyQueue(5);
		
		mq.enQueue(10);
		mq.enQueue(20);
		mq.enQueue(30);
		mq.enQueue(40);
		mq.enQueue(50);
		System.out.println(mq);
		
		System.out.println(mq.deQueue());
		System.out.println(mq);
		
		System.out.println(mq.size());
		System.out.println(mq.deQueue());
		System.out.println(mq.size());
		
		
		
	}
	
}
