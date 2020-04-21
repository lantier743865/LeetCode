package Easy.String;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 */
public class FirstUniqChar {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("cc"));
	}

	/**
	 * 用个大小26的数组记录每个字母出现的个数再遍历找到出现数为1的
	 */
	public static int firstUniqChar(String s) {
		if (s == null || s.isEmpty()) return -1;
		char[] cs = s.toCharArray();
		int[] count = new int[26];
		for (char ch : cs){
			count[ch - 'a']++;
		}
		for (int i = 0;i <cs.length;i++){
			if(count[cs[i] - 'a'] == 1){
				return i;
			}
		}
		return -1;
	}
}
