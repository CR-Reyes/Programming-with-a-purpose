public class multiplyMatrices {
	public static void main(String[] args) {
		double[][] A = {
			{1, 0, 0},
			{0, 1, 0},
			{0, 0, 1}
		};
		System.out.println("Matrix A");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		double[][] B = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		System.out.println("Matrix B");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		double dot;
		if (A[0].length == B.length) {
			double[][] C = new double[A.length][B[0].length];
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < B[0].length; j++) {
					dot = 0;
					for (int k = 0; k < B.length; k++) {
						dot += A[i][k] * B[k][j];
					}
					C[i][j] = dot;
				}
			}
			System.out.println("Matrix multiplication");
			for (int i = 0; i < C.length; i++) {
				for (int j = 0; j < C[0].length; j++) {
					System.out.print(C[i][j] + " ");
				}
				System.out.println();
			}	
		} else {
			System.out.println("Wrong dimensions!");
		}
	}
}
