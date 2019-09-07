public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        int n = 0;
        while (Math.pow(k, ++n) <= i) ;
        long dig;
        String letter = "#";
        if (k > 10) {
            while (n > 0) {
                dig = i / (long) Math.pow(k, --n);
                i = i % (long) Math.pow(k, n);
                if (dig > 9) {
                    if (dig == 10) letter = "A";
                    else if (dig == 11) letter = "B";
                    else if (dig == 12) letter = "C";
                    else if (dig == 13) letter = "D";
                    else if (dig == 14) letter = "E";
                    else if (dig == 15) letter = "F";
                    System.out.print(letter);
                } else {
                    System.out.print(dig);
                }
            }
        } else {
            while (n > 0) {
                dig = i / (long) Math.pow(k, --n);
                i = i % (long) Math.pow(k, n);
                System.out.print(dig);
            }
        }
        System.out.println();
    }
}
