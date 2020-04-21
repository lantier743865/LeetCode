package Medium.LinkList;

import Easy.LinkList.ListNode;

/**
 * 两数相加
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(6);
		ListNode l4 = new ListNode(9);
		ListNode l5 = new ListNode(9);
		ListNode l6 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;
		l4.next = l5;
		l5.next = l6;

		ListNode res = addTwoNumbers(l1, l4);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode temp = null;
		int j = 0;
		while (l1 != null || l2 != null || j != 0) {
			int z = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + j;
			j = z / 10;
			ListNode listNode = new ListNode(z % 10);
			if (temp == null) {
				temp = listNode;
				head = temp;
			} else {
				temp.next = listNode;
				temp = temp.next;
			}

			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
		}
		return head;
	}
}
