/*
    La clase GeneralizedHarmonic imprime el n-ésimo
    harmónico de orden r, es decir:
    harm = 1 + 1/(2^r) + 1/(3^r) + ... + 1/(n^r)
 */
public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double harm = 0;
        for (int i = 1; i <= n; i++) {
            harm += 1 / Math.pow(i, r);
        }
        System.out.println(harm);
    }
}
