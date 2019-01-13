public class LinkedList {
	
	
	// The LinkedList Node class
	private class Node{
		
		int data;
		Node next;
		
		Node(int gdata)
		{
			this.data = gdata;
			this.next = null;
		}
		
	}
	
	// The LinkedList fields
	Node head;
	
	// Constructor
	LinkedList(int gdata)
	{
		this.head = new Node(gdata);
	}
	
	public void Insertend(int gdata)
	{
		Node current = this.head;

		while(current.next!= null)
		{
			current = current.next;
		}
		
		Node newnode = new Node(gdata);
		current.next = newnode;
		
	}
	
	public void Listprint()
	{
		Node current = this.head;

		while(current!= null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
		
	}
	
	public void Removemin() {
	// Complete this method to remove the minimum value in a linkedlist
		Node min = head; //minimum value to be removed
		Node current = head; //current value being examined
		Node previous = null; //previous minimum element
		
		while(current != null) { //While we are traversing the list
			if(current.next != null && current.next.data < min.data) {
				min = current.next; //if next element's data < the current 						    //min, set min's value to that
				previous = current; 
			}
			current = current.next; //move on to the next element
		}
		if(min != head) {
			previous.next = min.next; //ensure that previous is not always 							  //null, must keep track of previous
						  //minimum element
		}
		else {
			head = head.next;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedList exlist = new LinkedList(0);
		
		exlist.Insertend(1);
		exlist.Insertend(5);
		exlist.Insertend(2);
		exlist.Insertend(7);
		exlist.Insertend(10);
		exlist.Insertend(3);
		
		exlist.Listprint();
		//output: 0 1 5 2 7 10 3
		
		exlist.Removemin();
		
		exlist.Listprint();
		//output should be: 0 1 5 2 7 3
		
		
	}
	
	
	

}
