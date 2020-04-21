package Easy.LinkList;

/**
 * 环形链表
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 进阶：
 * 你能否不使用额外空间解决此题？
 */
public class HasCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) return false;
		ListNode quick = head;
		while (quick.next != null) {
			head = head.next;
			quick = quick.next.next;
			if (quick == null)
				return false;
			if (head == quick)
				return true;
		}
		return false;
	}
}
