package Easy.LinkList;

/**
 * 回文链表
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class IsPalindrome {
	public boolean isPalindrome(ListNode head) {
		if (head == null) return true;
		if (head.next == null) return true;
		ListNode slow = head;
		ListNode qucik = head;
		while (qucik != null) {
			slow = slow.next;
			qucik = qucik.next.next;
			if (qucik == null) {
				//链表长度偶数
				ListNode behind = reverseList(slow);
				while (behind != null) {
					if (head.val != behind.val) {
						return false;
					}
					head = head.next;
					behind = behind.next;
				}
				return true;
			} else if (qucik.next == null) {
				//链表长度奇数
				ListNode behind = reverseList(slow.next);
				while (behind != null) {
					if (head.val != behind.val) {
						return false;
					}
					head = head.next;
					behind = behind.next;
				}
				return true;
			}
		}
		return false;
	}

	//翻转链表
	public ListNode reverseList(ListNode head) {
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
