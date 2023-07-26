
public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		System.out.println("(1) 공백에 노드 3개 삽입하기");
		link.insertLastNode("1");
		link.insertLastNode("3");
		link.insertLastNode("7");
		link.printList();
		
		System.out.println("(2) 3노드 뒤에 5 노드 삽입하기");
		ListNode pre = link.searchNode("3");
		
		if(pre==null)
			System.out.println("검색 실패");
		else {
			link.insertMiddleNode(pre, "5");
			link.printList();
		}
		
		System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
		link.reverseList();
		link.printList();
		
		System.out.println("(4) 리스트의 마지막 노드 삭제하기");
		link.deleteLastNode();
		link.printList();

	}

}
