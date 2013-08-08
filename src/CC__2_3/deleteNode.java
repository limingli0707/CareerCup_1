package CC__2_3;

//RemoveMid1():这道题开始读题的时候以为是删除center node，用两个指针，一个每次加1，一个每次加2。（还有一个指针用来删除）
//RemoveMid2():看了答案之后，估计题目的意思是说删除指定的节点（这里的middle应该指的是除head和tail的节点），并且只给定要删除的节点。

public class deleteNode<AnyType>
{
	public static void main(String[] args)
	{
		deleteNode<Integer> q = new deleteNode<Integer>();
		
		q.AddToList(4);q.AddToList(5);q.AddToList(6);
		q.AddToList(7);q.AddToList(0);q.AddToList(1);
		q.AddToList(3);q.AddToList(2);q.AddToList(5);
		q.PrintList();
		q.RemoveMid1();
		q.PrintList();
		q.RemoveMid2(q.head.next.next.next);
		q.PrintList();
	}
	
	
	private Node<AnyType> head;
	
	public deleteNode()
	{
		head = new Node<AnyType>(null, null);
	}
	
	public void AddToList(AnyType e)
	{
		Node<AnyType> temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = new Node<AnyType>(e, null);
	}
	
	public void RemoveMid1()
	{
		Node<AnyType> curNode = head.next;
		Node<AnyType> preNode = head.next;
		Node<AnyType> prepreNode = head.next;
		
		while (curNode != null && curNode.next != null)
		{
			curNode = curNode.next.next;
			prepreNode = preNode;
			preNode = preNode.next;
		}
		
		prepreNode.next = preNode.next;
	}
	
	public void RemoveMid2(Node<AnyType> node)
	{
		if (node == null || node.next == null)
			return;
		
		Node<AnyType> temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
	}
	
	public void PrintList()
	{
		Node<AnyType> temp = head;
		while (temp.next != null)
		{
			temp = temp.next;
			System.out.print(temp.data + " ");
		}
		System.out.println();
	}
	
	private class Node<Type>
	{
		Node(Type d, Node<Type> n)
		{
			data = d;
			next = n;
		}
		
		void PrintNode()
		{
			System.out.println(data);
		}
		
		Type data;
		Node<Type> next;
	}
}
