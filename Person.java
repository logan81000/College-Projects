package CSC400_work;

import java.util.Iterator;
import java.util.Scanner;



public class Person {
	


	static queue queue1 = new queue("", 0);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("Please enter the first and last name: ");
			String name = input.nextLine();
			System.out.print("Please enter the age of " + name + ": ");
			int age = input.nextInt();
			input.nextLine();
			queue1.enqueue(name, age);
		}
		input.close();
		Iterator<queue> iterator = queue1.Iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(queue1.isEmpty());
		System.out.println(queue1.dequeue() + "\n");
						
		iterator = queue1.Iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		queue1.clear();
		System.out.println(queue1.isEmpty());
	}

}
