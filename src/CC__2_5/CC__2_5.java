package CC__2_5;
import java.util.*;

//初看题目没看懂，看第二遍发现原来是给你一个有环的链表，让你找环的入口。顿时想起在地里看过这题，于是翻阅自己的回复终于找到了类似题的帖子。感谢farayaw，算法的论证非常精彩，我只不过是将算法用C++实现了一下。算法很简单，首先两个指针从链表的头部一个走两步，一个走一步。若相遇，则说明有环。然后一个指针退回到链表的头部，一个仍在相遇的地方，两指针都每次走一步，直到相遇，
//此时的相遇点就是环的入口，代码实现非常简单，两个while循环搞定。时间O(N)，空间O(1)
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
 
public class CC__2_5{
public static Node findEntrance(Node head) {
Node slow = head.next;
Node fast = head.next.next;
int count = 1;
while (slow != fast&&fast!=null) {
slow = slow.next;
fast = fast.next.next;
count++;
}
if(fast.next==null) return null;
slow = head;
while (slow != fast) {
slow = slow.next;
fast = fast.next;
}
return slow;
}
}