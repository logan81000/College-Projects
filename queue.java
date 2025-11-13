package CSC400_work;


import java.util.Iterator;
import java.util.LinkedList;

public class queue {
	String name;
	int age;
	
	queue(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person: " + name + " age: " + age;
	}
	


	
	LinkedList<queue> queue = new LinkedList<>();
	
	public void enqueue(String name, int age) {
		try {
			this.queue.addLast(new queue(name, age));
		}
		catch (Exception e) {
			System.out.println("Error when adding to the queue.");
		}
	}
	
	public queue dequeue() {
		try {
			queue temp = this.queue.getFirst();
			this.queue.removeFirst();
			return temp;
		}
		catch(Exception e) {
			System.out.println("A error occured when dequeuing");
			return null;
		}
		
	}
	
	public queue getFront() {
		try {
			return this.queue.getFirst();
		}
		catch (Exception NullPointerException ) {
			System.out.println("The queue is empty");
			return null;
		}
	}
	
	public boolean isEmpty() {
		if (this.queue.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clear() {
		this.queue.clear();
	}
	
	public Iterator<queue> Iterator() {
		return this.queue.iterator();
	}
}
