package CC__2_4;




class Node{
	Node next =null;
	int data;
	public Node(int d){data=d;}
	void appendToTail(int d){
		Node end =new Node(d);
		Node n =this;
		while(n.next!=null){n=n.next;}
		n.next=end;
	}
}

public class CC__2_4 {
	public static Node add( Node a, Node b )
	{
	Node result = new Node(( a.data + b.data )%10);
	Node result_head = result;
	int carry = ( a.data + b.data )/10;
	while( a.next != null || b.next != null )
	{
	if( a.next != null && b.next != null )
	{
	result.next = new Node(( a.next.data + b.next.data + carry )%10);
	carry = ( a.next.data + b.next.data + carry )/10;
	a = a.next;
	b = b.next;
	result = result.next;
	}
	else if( a.next != null )
	{
	result.next = new Node(( a.next.data + carry )%10);
	carry = ( a.next.data + carry )/10;
	a = a.next;
	result = result.next;
	}
	else
	{
	result.next = new Node(( b.next.data + carry )%10);
	carry = ( b.next.data + carry )/10;
	b = b.next;
	result = result.next;
	}
	}
	return result_head;
	}

}
