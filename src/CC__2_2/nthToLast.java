package CC__2_2;



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

public class nthToLast {
	public static Node nthToLast(Node head,int n){
		if(head==null||n<1){
			return null;
		}
		Node p1=head;
		Node p2=head;
		for(int i=0;i<n-1;i++){
			if(p2==null){
				return null;
			}
			p2=p2.next;
		}
		for(;p2.next!=null;){
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}

}
