package Easy.String;

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strings = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strings));
	}

	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		if(strs.length == 1) return strs[0];
		String res = "";
		int i = 0;
		while (1==1){
			char c = 0;
			for (String s : strs){
				if("".equals(s) || i == s.length()) return res;
				if(c == 0) c = s.charAt(i);
				if(s.charAt(i) != c){
					return res;
				}
			}
			res += String.valueOf(c);
			i++;
		}
	}
}
