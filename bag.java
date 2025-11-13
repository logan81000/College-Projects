package CSC400_work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class bag {
	// creates a private arraylist that can't be accessed outside of the class
	private List<String> baglist = new ArrayList<String>();
	
	// adds a item to baglist
	void add(String item) {
		this.baglist.add(item);
	}
	
	// removes an item from baglist
	void remove(String item) {
		this.baglist.remove(item);
	}
	
	// return true or false on if a item is in baglist
	boolean contains(String item) {
		return this.baglist.contains(item);
	}
	
	// returns count of all elements in baglist
	public int size() {
		return this.baglist.size();
	}
	
	void merge(bag bag1, bag bag2) {
		bag1.baglist.addAll(bag2.baglist);
	}

	
	void distinct() {
		bag uniquebag = new bag();
		uniquebag.baglist = this.baglist.stream().distinct().collect(Collectors.toList());
		this.baglist = uniquebag.baglist;
	}

	public static void main(String[] args) {
		
	}
	// makes baglist to return as a string when outputted
	  @Override
	    public String toString() {
	        return baglist.toString();
	    }



}
