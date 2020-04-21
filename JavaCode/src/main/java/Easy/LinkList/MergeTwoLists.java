package Easy.LinkList;

/**
 * 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) return null;
		if(l1 == null && l2 != null) return l2;
		if(l1 != null && l2 == null) return l1;
		if(l1.val > l2.val){
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		ListNode res = l1;
		while (l1 != null && l2 != null){
			if(l2.val >= l1.val && (l1.next == null || l2.val < l1.next.val)){
				ListNode temp = l2;
				l2 = l2.next;
				temp.next = l1.next;
				l1.next = temp;
				l1 = l1.next;
			}else{
				l1 = l1.next;
			}
		}
		if(l2 != null){
			l1.next = l2;
		}
		return res;
	}
}
