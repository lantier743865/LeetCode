package Easy.Other;

/**
 * 缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */
public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
		System.out.println(missingNumber(nums));
	}

	/**
	 * 等差数列求和再逐一减去数组里的数
	 */
	public static int missingNumber(int[] nums) {
		int count = nums.length * (nums.length + 1) / 2;
		for (int i : nums)
			count -= i;
		return count;
	}
}
