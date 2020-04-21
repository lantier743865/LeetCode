package Easy.Sorting;

/**
 * 加一
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
		if (digits[0] == 0) {
			digits[0]++;
			return digits;
		}
		int jw = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			if ((digits[i] + jw) % 10 == 0) {
				digits[i] = 0;
			} else {
				digits[i]++;
				return digits;
			}
		}
		int[] res = new int[digits.length + jw];
		res[0] = 1;
		for (int i = 0; i < digits.length; i++) {
			res[i + 1] = digits[i];
		}
		return res;
	}
}
