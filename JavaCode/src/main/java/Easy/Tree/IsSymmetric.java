package Easy.Tree;

import java.util.List;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 */
public class IsSymmetric {

	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		left.left = new TreeNode(3);
//		left.right = new TreeNode(4);
		TreeNode rigth = new TreeNode(3);
		rigth.left = new TreeNode(2);
//		rigth.right = new TreeNode(3);
		treeNode.left = left;
		treeNode.right = rigth;
		System.out.println(isSymmetric(treeNode));
	}


	/**
	 * 递归的方法
	 */
	public static boolean isSymmetric(TreeNode root) {
		return isSymmetric2(root.left, root.right);
	}

	public static boolean isSymmetric2(TreeNode left, TreeNode right) {
		if (left == null && right == null) return true;
		if (left == null || right == null) return false;
		return left.val == right.val && isSymmetric2(left.left, right.right) && isSymmetric2(left.right, right.left);
	}

	/**
	 * 二叉树中序遍历(递归)
	 *
	 * @return
	 */
	private static void inOrderTraverse(TreeNode treeNode, List<Integer> integers) {
		if (treeNode != null) {
			inOrderTraverse(treeNode.left, integers);
			integers.add(treeNode.val);
			inOrderTraverse(treeNode.right, integers);
		} else {
			integers.add(-1);
		}
	}
}
