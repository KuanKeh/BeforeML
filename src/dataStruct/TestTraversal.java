package dataStruct;

import java.util.LinkedList;

public class TestTraversal {
	
	LinkedList<ListNode> list = new LinkedList<ListNode>();
	
	public TestTraversal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ListNode[] list = new ListNode[10];
		for(int i = 0; i < list.length; i++) {
			list[i] = new ListNode("",i); 
		}
		
	}
	
	
	
	
	public static boolean isEmpty(ListNode[] list) {
		return list.length == 0;
	}
	
	public void push(ListNode l) {
		list.addFirst(l);
	}
	
	public ListNode pop() {
		return list.removeFirst();
	}

}
