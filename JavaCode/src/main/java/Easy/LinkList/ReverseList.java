package Easy.LinkList;

/**
 * 反转链表
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class ReverseList {
	public ListNode reverseList(ListNode head) {
		if (head == null) return null;
		ListNode pre = null, last = null;
		ListNode node = head;
		while (node != null) {
			ListNode next = node.next;
			if (next == null) {
				last = node;
			}
			node.next = pre;
			pre = node;
			node = next;
		}
		return last;
	}
}
