package CC__2_5;
import java.util.*;

//������Ŀû���������ڶ��鷢��ԭ���Ǹ���һ���л������������һ�����ڡ���ʱ�����ڵ��￴�����⣬���Ƿ����Լ��Ļظ������ҵ�������������ӡ���лfarayaw���㷨����֤�ǳ����ʣ���ֻ�����ǽ��㷨��C++ʵ����һ�¡��㷨�ܼ򵥣���������ָ��������ͷ��һ����������һ����һ��������������˵���л���Ȼ��һ��ָ���˻ص������ͷ����һ�����������ĵط�����ָ�붼ÿ����һ����ֱ��������
//��ʱ����������ǻ�����ڣ�����ʵ�ַǳ��򵥣�����whileѭ���㶨��ʱ��O(N)���ռ�O(1)
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