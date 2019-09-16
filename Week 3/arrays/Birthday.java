public class Birthday {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int bday;
		int filled = 0;
		boolean[] Bdays;
		int[] count = new int[trials];
		for (int i = 0; i < trials; i++) {
			Bdays = new boolean[n];
			for (int j = 1; j < n; j++) {
				bday = (int) (Math.random() * n);
				if (j > filled) filled = j;
				if (!Bdays[bday]) {
				       	Bdays[bday] = true;
				} else {
					count[j]++;
					break;
				}
			}
		}
		double[] fraction = new double[filled];
		for (int i = 1; i < filled; i++) {
			fraction[i] = fraction[i-1] + (double) count[i] / (double) trials;
			System.out.println(i + "\t" + count[i] + "\t" + fraction[i]);
			if (fraction[i] >= 0.5) break;
		}
	}
}
		
