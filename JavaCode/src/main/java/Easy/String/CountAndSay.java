package Easy.String;

/**
 * 数数并说
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 */
public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(6));
	}


	/**
	 * 判断并合并相同的数
	 */
	public static String countAndSay(int n) {
		String res = "1";
		while (--n > 0) {
			int i = 0;
			StringBuilder news = new StringBuilder();
			while (i < res.length()) {
				StringBuilder temp = new StringBuilder();
				for (; i < res.length(); i++) {
					temp.append(res.charAt(i));
					if (i + 1 == res.length() || res.charAt(i) != res.charAt(i + 1)) {
						i++;
						break;
					}
				}
				news.append(temp.length()).append(String.valueOf(temp.charAt(0)));
			}
			res = news.toString();
		}
		return res;
	}
}
