package Easy.LinkList;

/**
 * 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 */
public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) return null;
		if(n <= 0) return head;
		ListNode pre = head;
		ListNode res = head;
		while(n>0){
			pre = pre.next;
			n--;
		}
		if(pre != null) {
			while (pre.next != null) {
				pre = pre.next;
				head = head.next;
			}
			head.next = head.next.next;
		}else{
			res = head.next;
		}
		return res;
	}
}
