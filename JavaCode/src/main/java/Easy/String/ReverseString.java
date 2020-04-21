package Easy.String;

/**
 * 反转字符串
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 * <p>
 * 示例：
 * <p>
 * 输入：s = "hello"
 * 返回："olleh"
 */
public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}

	public static String reverseString(String s) {
		if(s.length() <= 1) return s;
		int k = s.length();
		char[] tc = s.toCharArray();
		char[] nc = new char[k];
		for (int i = 0;i<k;i++){
			nc[i] = tc[k-i-1];
		}
		return new String(nc);
	}
}
