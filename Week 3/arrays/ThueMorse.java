public class ThueMorse {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		boolean[] seq = new boolean[n];
		for (int i = 1; i < n; i *= 2) {
			for (int j = 0; j < i && (i + j) < n; j++) {
				seq[i + j] = !seq[j];
			}
		}
		String[][] N = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				N[i][j] = (seq[i] == seq[j]) ? "+" : "-";
				System.out.print(N[i][j] + " ");
			}
			System.out.println();
		}
	}
}
