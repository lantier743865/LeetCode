package Easy.Sorting;

import java.util.HashSet;

public class IsValidSudoku {

	public static void main(String[] args) {
		char[][] board = {
				{'5', '8', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};
		System.out.println(isValidSudoku(board));
	}


	public static boolean isValidSudoku(char[][] board) {
		HashSet<Integer> integerHashSet;
		//检查横向
		for (int i = 0; i < 9; i++) {
			integerHashSet = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (!integerHashSet.add(Integer.valueOf(board[i][j])))
						return false;
				}
			}
		}
		//检查纵向
		for (int i = 0; i < 9; i++) {
			integerHashSet = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (board[j][i] != '.') {
					if (!integerHashSet.add(Integer.valueOf(board[j][i])))
						return false;
				}
			}
		}
		//方格检查
		for (int q = 0; q < 3; q++) {
			for (int p = 0; p < 3; p++) {
				integerHashSet = new HashSet<>();
				for (int i = q * 3; i < q * 3 + 3; i++) {
					for (int j = p * 3; j < p * 3 + 3; j++) {
						if (board[i][j] != '.') {
							if (!integerHashSet.add(Integer.valueOf(board[i][j])))
								return false;
						}
					}
				}
			}
		}
		return true;
	}
}
