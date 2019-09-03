public class CMYKtoRGB {
	public static void main(String[] args) {
		double C, M, Y, K, white;
		int R, G, B;
		C = Double.parseDouble(args[0]);
		M = Double.parseDouble(args[1]);
		Y = Double.parseDouble(args[2]);
		K = Double.parseDouble(args[3]);
		white = 1 - K;
		R = (int) (255 * white * (1 - C));
		G = (int) (255 * white * (1 - M));
		B = (int) (255 * white * (1 - Y));
		System.out.println("red   = " + R);
		System.out.println("green = " + G);
		System.out.println("blue  = " + B);
	}
}
