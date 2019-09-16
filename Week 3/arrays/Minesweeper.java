public class Minesweeper {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		boolean[][] mines_grid = new boolean[m][n];
		int[][] count_grid = new int[m][n];
		// generate mines
		int row;
		int col;
		for (int i = 0; i < k; i++) {
			row = (int) (Math.random() * m);
			col = (int) (Math.random() * n);
			if (!mines_grid[row][col]) {
				mines_grid[row][col] = true;
				if (row > 0) count_grid[row-1][col]++;									if (col > 0) count_grid[row][col-1]++;
				if (row < m-1) count_grid[row+1][col]++;
				if (col < n-1) count_grid[row][col+1]++;
				if (row > 0 && col > 0) count_grid[row-1][col-1]++;
				if (row > 0 && col < n-1) count_grid[row-1][col+1]++;
				if (row < m-1 && col > 0) count_grid[row+1][col-1]++;
				if (row < m-1 && col < n-1) count_grid[row+1][col+1]++;
			} else {
				i--;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mines_grid[i][j]) System.out.print("* ");
				else System.out.print(count_grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}
