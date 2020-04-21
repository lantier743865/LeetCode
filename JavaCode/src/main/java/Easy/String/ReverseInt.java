package Easy.String;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 */
public class ReverseInt {
	public int reverse(int x) {
		String s =  String.valueOf(x);
		int k = s.length();
		int i = 0;
		char[] e = s.toCharArray();
		char[] d = new char[k];
		if(e[0] == '-') {
			d[0] = '-';
			i = 1;
		}
		for(int j = 0;i<k;i++){
			d[i] = e[k-j-1];
			j++;
		}
		String ss = new String(d);
		int r = 0;
		try {
			r = Integer.valueOf(ss);
		}catch (NumberFormatException ne){
			r = 0;
		}
		return r;
	}
}
