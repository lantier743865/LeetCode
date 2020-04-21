package Easy.Math;

/**
 * 给出一个整数，写一个函数来确定这个数是不是3的一个幂。

 后续挑战：
 你能不使用循环或者递归完成本题吗？
 */
public class IsPowerOfThree {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree2(9));
	}

	public static boolean isPowerOfThree(int n) {
		return (n > 0 && 1162261467 % n == 0);
	}

	/**
	 * 底数换底的方式
	 */
	public static boolean isPowerOfThree2(int n) {
		if (n <= 0) {
			return false;
		}
		double num = Math.log10(n) / Math.log10(3);
		if (num % 1 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
