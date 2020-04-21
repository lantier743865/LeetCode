package Easy.Other;

import java.util.Stack;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class IsValid {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}

	public static boolean isValid(String s) {
		if (s == null || s.isEmpty()) return true;
		if (s.length() % 2 != 0) return false;
		Stack<Character> stack = new Stack<>();
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (!stack.empty() && stack.peek() == '(') {
					stack.pop();
				} else {
					flag = false;
					break;
				}
			} else if (s.charAt(i) == ']') {
				if (!stack.empty() && stack.peek() == '[') {
					stack.pop();
				} else {
					flag = false;
					break;
				}
			} else if (s.charAt(i) == '}') {
				if (!stack.empty() && stack.peek() == '{') {
					stack.pop();
				} else {
					flag = false;
					break;
				}
			}
		}
		if (!stack.empty()) {
			flag = false;
		}
		return flag;
	}
}
