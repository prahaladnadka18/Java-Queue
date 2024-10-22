package queue;

public class MyQueue {
	
	private int capacity;
	private int rear,front;
	private Object[] obj;
	
	MyQueue(int capacity){
		this.capacity=capacity;
		rear=front=-1;
		obj = new Object[capacity];
	}

	public void enQueue(Object data) {
		
		if(rear==capacity-1) {
			System.out.println("Queue is Full...!!");
			return;
		}
		
		if(front==-1)
			front=0;
		
		obj[++rear]=data;
		
	}
	
	@Override
	public String toString() {
		String st="[";
		for(int i=front;i<=rear&&front!=-1;i++) {
			st=st+obj[i];
			if(i<rear) {
				st=st+",";
			}
		}
		return st+"]";
	}

	public Object deQueue() {
		
		if(front==-1) {
			System.out.println("Queue is Empty..!!");
			return "";
		}
		
		Object data=obj[front++];
		if(front>rear) {
			front=rear=-1;
		}
		
		return data;
		
	}

	public int size() {
		
		if(front==-1) {
			return 0;
		}
		
		return rear-front+1;
		
	}
	
	
	
	

}
