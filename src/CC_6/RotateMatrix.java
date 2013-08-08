package CC_6;

public class RotateMatrix {
	static void rotateClockwise(int[][] matrix) {
		int length = matrix.length - 1;
		for (int row = 0; row < (length + 1) / 2; row++) {
			for (int start = row; start < length - row; start++) {
				int temp = matrix[row][start];
				matrix[row][start] = matrix[length - start][row];
				matrix[length - start][row] = matrix[length - row][length - start];
				matrix[length - row][length - start] = matrix[start][length - row];
				matrix[start][length - row] = temp;
			}
		}
	}
		
	static void rotateCounterClockwise(int[][] matrix) {
		int length = matrix.length - 1;
		for (int row = 0; row < (length + 1) / 2; row++) {
			for (int start = row; start < length - row; start++) {
				int temp = matrix[row][start]; 
				matrix[row][start] = matrix[start][length - row]; 
				matrix[start][length - row] = matrix[length - row][length - start];
				matrix[length - row][length - start] = matrix[length - start][row]; 
				matrix[length - start][row] = temp; 
			}
		}
	}

}
