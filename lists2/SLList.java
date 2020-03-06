 /** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList {	
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
			//System.out.println(size);
		}
	} 

	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;

	/*private static void lectureQuestion() {
		SLList L = new SLList();
		IntNode n = IntNode(5, null);
	}*/

	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	/** Takes in an array of integers, and creates an SLList with those integers */
	public SLList(int[] array) {
		sentinel = new IntNode(63, null);
		for (int i = 0; i < array.length; i += 1) {
			addLast(array[i]);
		}
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(int x) {
 		sentinel.next = new IntNode(x, sentinel.next);
 		size = size + 1;
 	}

 	/** Returns the first item in the list. */
 	public int getFirst() {
 		return sentinel.next.item;
 	}

 	/** Adds x to the end of the list. */
 	public void addLast(int x) {
 		size = size + 1; 		

 		IntNode p = sentinel;

 		/* Advance p to the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new IntNode(x, null);
 	}
 	
 	/** Returns the size of the list. */
 	public int size() {
 		 return size;
 	}

	/** Delete the first item of the list. */
	public void deleteFirst() {
		size -= 1;
		sentinel.next = sentinel.next.next;
	}

	public static void main(String[] args) {
 		/* Creates a list of one integer, namely 10 */
		// SLList L = new SLList();
		int[] array = new int[]{1,2,3,4,5};
		SLList L = new SLList(array);
		// L.addLast(20);
		// L.addLast(30);
		// L.deleteFirst();
 		System.out.println(L.size());
 	}
}