package Easy.Other;

/**
 * 位1的个数
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * <p>
 * 示例 :
 * <p>
 * 输入: 11
 * 输出: 3
 * 解释: 整数 11 的二进制表示为 00000000000000000000000000001011
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: 128
 * 输出: 1
 * 解释: 整数 128 的二进制表示为 00000000000000000000000010000000
 */
public class HammingWeight {

	public static void main(String[] args) {
		System.out.println(hammingWeight2(11));
	}

	/**
	 * 移位的方式来10进制转2进制
	 */
	public static int hammingWeight(int n) {
		int j = 0;
		for (int i = 31; i >= 0; i--)
			if ((n >>> i & 1) == 1) j++;
		return j;
	}

	/**
	 * JAVA API转换2进制
	 */
	public static int hammingWeight2(int n) {
		int j = 0;
		String s = Integer.toBinaryString(n);
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 49) j++;
		return j;
	}
}
