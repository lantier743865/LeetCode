package Medium.LinkList;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;

import Easy.LinkList.ListNode;

/**
 * 奇偶链表
 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。

 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes为节点总数。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 1->3->5->2->4->NULL
 说明:

 应当保持奇数节点和偶数节点的相对顺序。
 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 */
public class OddEvenList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		ListNode res = oddEvenList(l1);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}

	public static ListNode oddEvenList(ListNode head) {
		ListNode res = head;
		ListNode odd = head;
		ListNode oddHead = odd;
		ListNode even = head.next;
		ListNode evenHead = even;
		while (odd != null){
			odd.next = odd.next.next;
			odd = odd.next;
		}
		Stack<ListNode> stack;
		Queue<ListNode> listNodes = new PriorityQueue<>();
		return evenHead;
	}
}
