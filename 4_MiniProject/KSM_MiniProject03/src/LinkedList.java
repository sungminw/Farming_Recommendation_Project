
public class LinkedList {
	private ListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		ListNode temp = head;
		newNode.link = pre;
		temp = temp.link;
		temp.link = newNode;
	}
	
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		if(head==null) {
			head = newNode;
		}else {
			ListNode temp = head;

			while(temp.link != null) {
	            temp = temp.link;
			}
	        temp.link = newNode;
		}
		
	}
	
	public void deleteLastNode() {
		ListNode pre, temp;
		
		
		
		
	}
	
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while(temp.link != null) {
			temp = temp.link;
		}
		return temp;
	}
	
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		
		head = current;
	}
	
	public void printList() {
		ListNode temp = this.head;
		System.out.print("L = ( ");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) {
				System.out.printf(",");
			}
		}
		System.out.println(" )");
	}

}
