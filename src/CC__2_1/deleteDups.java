package CC__2_1;

import java.util.Hashtable;

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

public class deleteDups {
	//If we can use a buffer, we can keep track of elements in a hashtable and remove any dups:
	public static void deleteDups(Node head){
	Hashtable table =new Hashtable();
	Node previous =null;
	while(head!=null){
	      if(table.containsKey(head.data)) previous.next=head.next;
	      else{
	    	  table.put(head.data, true);
	    	  previous = head;
	      }
	      head=head.next;
	}
	}
	//without a buffer
	public static void  deleteDups2(Node head){
		if(head==null) return;
		Node iter =head;
		while(iter!=null){
			Node current =iter;
			while(current.next!=null){
				if(current.next.data==iter.data){
					current.next=current.next.next;
				}
				current=current.next;
			}
			iter=iter.next;
		}
	}
	
	public static void  deleteDups3(Node head){
		if(head==null) return;
		Node pre =head;
		Node cur=pre.next;
		while(cur!=null){
			Node runner =head;//make sure allnodes before runner do not contain duplicates
			while(runner!=cur){
				if(runner.data==cur.data){
					pre.next=cur.next;
					cur =pre.next;
					break;
				}
				runner =runner.next;
				
			}
			if(runner==cur){
				pre=cur;
				cur=cur.next;
			}
		}
	}

	//bitmap
	public static void  deleteDups4(Node head){
		if(head==null) return;
		int [] map= new int[256];
		for(int i:map){
			i=0;
		}
		Node cur =head;
		while(cur!=null){
			map[cur.data]++;
			cur=cur.next;
			
		}
		for(int i =0;i<map.length;i++){
			if(map[i]>1){
				//this.delete(i);
				map[i]--;
			}
		}
	}
}


