package CSC400_work;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class linkedlistmaker {
	
	node first;

	private static class node {
		
		int data;
		
		node next;
		
		node (int a) {
			data = a;
			next = null;
		}
	}
	
	public static linkedlistmaker insert(linkedlistmaker linkedlist, int d) {
		node n = new node(d);
		n.next = null;
		
		if (linkedlist.first == null) {
			linkedlist.first = n;
		}
		else {
			node l = linkedlist.first;
			
			while (l.next != null) {
				l = l.next;
			}
			
			l.next = n;
		}
		
		return linkedlist;
	}
	
	public static linkedlistmaker delete(linkedlistmaker linkedlist, int d) {
		node c = linkedlist.first;
		node p = null;
		if (c != null && c.data == d) {
			linkedlist.first = c.next;
			System.out.println(d + " was removed from list");
			return linkedlist;
		}
		
		while (c != null && c.data != d) {
			p = c;
			c = c.next;
		}
		
		if (c != null) {
			p.next = c.next;
			System.out.println(d + " was removed from list");
		}
		
		if (c == null) {
			System.out.println(d + " was not found in the list");

		}
		return linkedlist;

	}
	
	public static void iterator(linkedlistmaker linkedlist) {
		node c = linkedlist.first;
		
		while (c != null) {
			System.out.print(c.data + " ");
			c = c.next;
		}
	}
	
	public static linkedlistmaker read(String n, linkedlistmaker linkedlist) {
		try {
		File f = new File(n);
		Scanner input = new Scanner(f);	
		
		while (input.hasNextInt()) {
			linkedlistmaker.insert(linkedlist, input.nextInt());
		}
		input.close();
		return linkedlist;
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		return null;

	}
	
	public class M {
		public static void main(String[] args) {
			linkedlistmaker linkedlist = new linkedlistmaker();
			
			linkedlistmaker.insert(linkedlist, 1);
			linkedlistmaker.insert(linkedlist, 2);
			linkedlistmaker.insert(linkedlist, 3);
			
			linkedlistmaker.iterator(linkedlist);
		}
	}

}
