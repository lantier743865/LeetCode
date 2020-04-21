package Easy.Dynamic;

/**
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。

 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

 注意：给定 n 是一个正整数。

 示例 1：

 输入： 2
 输出： 2
 解释： 有两种方法可以爬到楼顶。
 1.  1 步 + 1 步
 2.  2 步
 示例 2：

 输入： 3
 输出： 3
 解释： 有三种方法可以爬到楼顶。
 1.  1 步 + 1 步 + 1 步
 2.  1 步 + 2 步
 3.  2 步 + 1 步
 */
public class JumpFloor {
	public static void main(String[] args) {
		System.out.println(climbStairs2(3));
	}

	/**
	 * 递归方法
	 */
	public static int climbStairs(int n) {
		if (n == 1 || n == 2) {
			return n;
		} else {
			return climbStairs(n - 1) + climbStairs(n - 2);
		}
	}

	/**
	 * 动态规划
	 */
	public static int climbStairs2(int n) {
		if(n == 1 || n == 2) return n;
		int i = 1;
		int j = 2;
		int res = 0;
		for (int s = 3; s <= n; s++) {
			res = i + j;
			i = j;
			j = res;
		}
		return res;
	}
}
