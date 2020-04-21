package Easy.Math;

import java.util.ArrayList;
import java.util.List;

/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。

 1. 如果 n 是3的倍数，输出“Fizz”；

 2. 如果 n 是5的倍数，输出“Buzz”；

 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 */
public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {
		List<String> s = new ArrayList<>();
		String fb = "FizzBuzz";
		String f = "Fizz";
		String b = "Buzz";
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				s.add(fb);
			} else if (i % 3 == 0) {
				s.add(f);
			} else if (i % 5 == 0) {
				s.add(b);
			} else {
				s.add(i + "");
			}
		}
		return s;
	}
}
