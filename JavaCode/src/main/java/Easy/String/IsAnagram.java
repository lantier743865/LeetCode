package Easy.String;

import java.util.Arrays;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * <p>
 * 例如，
 * s = "anagram"，t = "nagaram"，返回 true
 * s = "rat"，t = "car"，返回 false
 * <p>
 * 注意:
 * 假定字符串只包含小写字母。
 * <p>
 * 提升难度:
 * 输入的字符串包含 unicode 字符怎么办？你能能否调整你的解法来适应这种情况？
 */
public class IsAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("hello", "olleh"));
	}

	public static boolean isAnagram(String s, String t) {
		int[] ints = new int[26];
		int[] intt = new int[26];
		for (char c : s.toCharArray()){
			ints[c - 'a']++;
		}
		for (char c : t.toCharArray()){
			intt[c - 'a']++;
		}
		return Arrays.equals(ints,intt);
	}
}
