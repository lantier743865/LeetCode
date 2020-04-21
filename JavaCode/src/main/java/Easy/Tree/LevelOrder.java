package Easy.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LevelOrder {
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		left.left = new TreeNode(3);
		left.right = new TreeNode(4);
		TreeNode rigth = new TreeNode(3);
		rigth.left = new TreeNode(2);
		rigth.right = new TreeNode(3);
		treeNode.left = left;
		treeNode.right = rigth;
		System.out.println();
	}

	private List<List<Integer>> allList = new ArrayList<>();

	public List<List<Integer>> levelOrder(TreeNode root) {
		return null;
	}

	public void levelOrder2(TreeNode treeNode, List<Integer> integerList) {

	}
}
