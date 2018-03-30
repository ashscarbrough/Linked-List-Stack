class Node
{
	int elem;
	Node next;
	
	public Node(int elem)
	{
		this.elem = elem;
		this.next = null;
	}
}

public class LinkedList
{
	private Node head = null;
	private Node tail = null;

	public LinkedList(){}
	
	public void traverse()
	{
		for (Node n = head; n != null; n = n.next)
		{
			System.out.print(" " + n.elem + " ");
		}
		System.out.println("");

	}
	
	public void add_to_head(int elem)
	{
		   if(head == null)
		   { 
		         head = tail = new Node(elem);
		   }
		   else
		   {
				Node n = new Node(elem);
				n.next = head;
				head = n;
			}	
	}
	
	public void add_to_tail(int elem)
	{
		   if(head == null)
		   { 
		         head = tail = new Node(elem);
		   }
		   else
		   {
				tail.next = new Node(elem);
				tail = tail.next;
			}	
	}
	
	public int remove_from_head()
	{
		   if(head == null)
		   { 
		         return -999;
		   }
		   else
		   {
			   Node n = head;
			   head = head.next;
				if(head == null) tail = null;
				return n.elem;
		  }	
	}
	
	public int remove_from_tail()
	{
		   if(head == null)
		   { 
		         return -999;
		   }
		   
		   if(head==tail)
		   {
			   Node n = head;
			   head=tail=null;
			   return n.elem;
		   }
		   else
		   {
				Node n = head;
				while(n.next != tail) n = n.next;
				Node m = tail;
				tail = n;
				tail.next = null;
				return m.elem;
		  }	
	}
}