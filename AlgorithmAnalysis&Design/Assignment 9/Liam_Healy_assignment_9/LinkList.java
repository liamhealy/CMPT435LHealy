
public class LinkedList {
	
	
	// The LinkedList Node class
	private class Node{
		
		int data;
		int val;
		Node next;
		
		Node(int gdata)
		{
			this.data = gdata;
			this.val = val;
			this.next = null;
		}
		
	}
	
	// The LinkedList fields
	Node head;
	
	// Constructor
	LinkedListProblem(int gdata)
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
	
	public static Node mergeSortedLists(Node first, Node second) {
		Node result = null;
		
		if(first == null) {
			return second;
		}
		if(second == null) {
			return first;
		}
		
		if(first.data <= second.data) {
			result = first;
			result.next = mergeSortedLists(first.next, second);
		}
		else {
			result = second;
			result.next = mergeSortedLists(first, second.next);
		}
		return result;
	}
	
	public static Node findMid(Node head) {
		
		if(head == null) {
			return head;
		}
		Node end = head.next;
		Node middle = head;
		
		while(end != null) {
			end = end.next;
			if(end != null) {
				middle = middle.next;
				end = end.next;
			}
		}
		return middle;
	}
	
	
	
	public static Node Listsort(Node start)
	{
	// Complete this method to sort a Linked list
	// Return the first node in the sorted list
	// Feel free to change the method type, add/remove parameters
	// Full credit (30 points) will be awarded for an algorithm that is O(nlog n). 
	// Algorithms that are O(n^2) slower will be scored out of 10 points. 
		if(start == null || start.next == null) {
			return start;
		}
		
		Node mid = findMid(start);
		Node next = mid.next;
		
		mid.next = null;
		
		Node left = Listsort(start);
		Node right = Listsort(next);
		
		Node sortedList = mergeSortedLists(left, right);
		return sortedList;
	}
	
	public static void main(String[] args) {
		
		LinkedListProblem exlist = new LinkedListProblem(0);
		
		exlist.Insertend(1);
		exlist.Insertend(5);
		exlist.Insertend(2);
		exlist.Insertend(7);
		exlist.Insertend(10);
		exlist.Insertend(3);
		
		exlist.Listprint();
		//output: 0 1 5 2 7 10 3
		exlist.Listsort(exlist.head);
		exlist.Listprint();
		//output should be: 0 1 2 3 5 7 10
		
		
	}
	
	
	

}
