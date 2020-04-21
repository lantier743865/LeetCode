package Easy.Math;

/**
 * 计算所有小于非负数整数 n 的质数数量。
 */
public class CountPrimes {

	public static void main(String[] args) {
		System.out.println(countPrimes(3));
	}


	public static int countPrimes(int n) {
		if (n < 2) return 0;
		int[] prime = new int[n];
		for (int i = 0; i < n; i++)
			prime[i] = 1;
		prime[0] = prime[1] = 0;
		int k = 0;
		int j;
		for (int i = 2; i * i < n; i++) {
			if (prime[i] != 1) continue;
			for (j = i * i; j < n; j += i)
				prime[j] = 0;
		}
		for (j = 0; j < n; j++)
			if (prime[j] == 1) k++;
		return k;
	}
}
