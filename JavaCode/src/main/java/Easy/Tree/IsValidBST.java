package Easy.Tree;

/**
 * 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 一个二叉搜索树具有如下特征：
 * <p>
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 * <p>
 * 输入:
 * 2
 * / \
 * 1   3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:
 * 5
 * / \
 * 1   4
 * / \
 * 3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 * 根节点的值为 5 ，但是其右子节点值为 4 。
 */
public class IsValidBST {

	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(2);
		TreeNode left = new TreeNode(1);
//		left.left = new TreeNode(3);
		TreeNode rigth = new TreeNode(3);
//		rigth.left = new TreeNode(2);
		treeNode.left = left;
		treeNode.right = rigth;
		System.out.println(isValidBST(treeNode));
	}

	public static boolean isValidBST(TreeNode root) {
		if (root == null) return true;
		if (root.left == null && root.right == null) return true;
		if (root.left != null && root.right == null){
			if(root.left.val < root.val)return true;
			else return false;
		}
		if(root.left == null && root.right != null){
			if(root.right.val > root.val)return true;
			else return false;
		}
		return isValidBST(root.left)
				&& isValidBST(root.right)
				&& (root.left.val < root.val && root.right.val > root.val);
	}
}
