package Easy.String;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 */
public class IsPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

	public static boolean isPalindrome(String s) {
		if(s == null || s.isEmpty()) return false;
		if(s.length() == 1) return true;
		s = s.replaceAll(" ","").replaceAll("[\\pP\\p{Punct}]","").toLowerCase();
		int k = s.length();
		char[] cs = s.toCharArray();
		for(int  i = 0;i<k;i++){
			if(cs[i] != cs[k-i-1]) return false;
		}
		return true;
	}
}
