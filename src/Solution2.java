
public class Solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode returnListNode = null;
		ListNode tempListNode = null;
		ListNode first = l1;
		ListNode second = l2;
		int overNum = 0;
		int sum = 0;
		int firstnum;
		int secondnum;

		returnListNode = tempListNode = new ListNode(0);
		while(first != null || second !=null) {
		    sum = 0;
			if (overNum >0) {
				sum = overNum;
			}
		    overNum = 0;
		    firstnum = (first == null) ? 0 : first.val;
		    secondnum = (second == null) ? 0 : second.val;
		    
			if (sum + firstnum + secondnum > 9) {
				overNum = 1;
			}
			sum = (sum + firstnum + secondnum) % 10;
			tempListNode.val = sum;
			
			if (first != null) first = (first.next != null) ? first.next : null;
			if (second != null) second = (second.next != null) ? second.next : null;
			if (first != null || second != null) {
				tempListNode.next = new ListNode(0);
				tempListNode = tempListNode.next;
			}
		}
		if (overNum!=0) {
			tempListNode.next = new ListNode(0);
			tempListNode = tempListNode.next;
			tempListNode.val = overNum;
		}
		return returnListNode;	
	}
}
