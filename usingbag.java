package CSC400_work;


public class usingbag {

	public static void main(String[] args) {
		// creates a instance of the bag class
		bag thebag = new bag();
		bag thebag2 = new bag();

		
		// adds the item in the parentheses to the arraylists in the bag class
		thebag.add("David");
		thebag.add("David");
		thebag.add("Barry");
		thebag.add("Logan");
		thebag.add("Bob");
		thebag.add("Joe");
		thebag.add("Tyler");
		thebag.add("Joe");
		thebag2.add("Jerry");
		thebag2.add("Jerry");
		thebag2.add("Larry");
		thebag2.add("Gary");
		thebag2.add("Dary");
		thebag2.add("Terry");
		thebag2.add("Kylie");
		thebag2.add("Kylie");
		
		
		// prints out the arraylists in the bag class
		System.out.println(thebag);
		System.out.println(thebag2);
		
		// prints out the size of the the arraylists
		System.out.println(thebag.size());
		System.out.println(thebag2.size());
		
		thebag.merge(thebag, thebag2);
		System.out.println(thebag);
		thebag.distinct();
		System.out.println(thebag);

		
		
		
		
	}

}
