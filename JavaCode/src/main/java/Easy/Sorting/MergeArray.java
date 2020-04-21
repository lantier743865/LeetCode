package Easy.Sorting;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 */
public class MergeArray {

	public static void main(String[] args) {
		int[] nums1 = {1, 3, 7, 0, 0, 0};
		int m = 3;
		int[] nums2 = {2, 8, 9};
		int n = 3;
		mergeArray2(nums1, m, nums2, n);
	}

	/**
	 * 定义一个新数组的方法
	 */
	public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
		int[] mer = new int[m + n];
		int k = Math.min(m, n);
		int i = 0, j = 0, q = 0;
		while (i < k && j < k) {
			if (nums1[i] < nums2[j]) {
				mer[q] = nums1[i];
				i++;
			} else {
				mer[q] = nums2[j];
				j++;
			}
			q++;
		}
		while (i < k) {
			mer[q] = nums1[i];
			i++;
			q++;
		}
		while (j < k) {
			mer[q] = nums2[j];
			j++;
			q++;
		}
	}

	/**
	 * 用插入排序的算法
	 */
	public static void mergeArray2(int[] nums1, int m, int[] nums2, int n) {
		int j = 0;
		for (int i : nums2) {
			boolean isInsert = false;
			if (i < nums1[0]) {
				BackShift(nums1, 0, m);
				nums1[0] = i;
				m++;
				continue;
			}
			for (; j < m - 1; j++) {
				if (i >= nums1[j] && i < nums1[j + 1]) {
					BackShift(nums1, j + 1, m);
					nums1[j + 1] = i;
					m++;
					isInsert = true;
					break;
				}
			}
			if (!isInsert) {
				nums1[m] = i;
				m++;
			}
		}
	}

	private static void BackShift(int[] num, int k, int m) {
		for (int i = m; i > k; i--) {
			num[i] = num[i - 1];
		}
	}
}
