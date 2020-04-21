package Easy.Other;

/**
 * 颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位。
 * <p>
 * 示例:
 * <p>
 * 输入: 43261596
 * 输出: 964176192
 * 解释: 43261596 的二进制表示形式为 00000010100101000001111010011100 ，
 * 返回 964176192，其二进制表示形式为 00111001011110000010100101000000 。
 * 进阶:
 * 如果多次调用这个函数，你将如何优化你的算法？
 */
public class ReverseBits {
	public static void main(String[] args) {
		System.out.println(reverseBits(2));
	}

	/**
	 * 将输入转换成2进制字符串，再翻转并扩充到32位，再将此32位的二进制转为无符号整数
	 * <p>
	 * int 在内存中以二进制形式存储，占据32位。用一个 int 型整数 ans 来记录结果，采用移位操作，
	 * 因为：1. 注意到移位操作比乘2、除2操作效率更高，2. 移位操作很好地绕开了整型运算的溢出以及符号问题。
	 * 在每次循环中：ans 每次左移一位，当 n 的最低位为1时，ans 的最低位就变为1，n 每次右移一位。
	 * 总共进行32次循环。
	 */
	public static int reverseBits(int n) {
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			ans <<= 1;
			if ((n & 1) == 1)
				ans++;
			n >>= 1;
		}
		return ans;
	}

	public static int reverseBits2(int n) {
		int ans = 0;
		for (int i = 0; i < 32; i++)
			ans |= ((n >> i) & 1) << (31 - i);
		return ans;
	}
}
