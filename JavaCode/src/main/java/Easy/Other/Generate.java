package Easy.Other;

import java.util.ArrayList;
import java.util.List;

/**
 * 帕斯卡三角形
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class Generate {

	public static void main(String[] args) {
		List<List<Integer>> listList = generate(5);
		for (List<Integer> integers : listList){
			String s = "";
			for (Integer integer : integers){
				s += integer + ",";
			}
			s = s.substring(0,s.length()-1);
			System.out.println(s);
		}
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> listList = new ArrayList<>();
		for (int i = 1; i <=numRows; i++) {
			List<Integer> integers = new ArrayList<>();
			for (int j = 0; j < i; j++) {
				if (j == 0) {
					integers.add(1);
					continue;
				}
				if (j + 1 == i) {
					integers.add(1);
					continue;
				}
				integers.add(listList.get(i-2).get(j-1)+listList.get(i-2).get(j));
			}
			listList.add(integers);
		}
		return listList;
	}
}
