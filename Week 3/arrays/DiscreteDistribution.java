public class DiscreteDistribution {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int[] S = new int[args.length];
		for (int i = 1; i < S.length; i++) {
			S[i] = S[i-1] + Integer.parseInt(args[i]);
		}
		for (int i = 0; i < m; i++) {
			int r = (int) (Math.random() * S[S.length-1]);
			for (int j = 1; j < S.length; j++) {
				if (r >= S[j-1] && r < S[j]) 
					System.out.print(j + " ");
			}
		}
		System.out.println();
	}
}


