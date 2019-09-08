/*
    La clase BandMatrix recibe dos enteros n y width, con
    ellos construye una matriz nxn tal que la diagonal y
    los espacios cercanos dentro de un rango width tengan
    un asterisco, mientras que los valores fuera de la
    diagonal y de ese rango tengan cero. Ej.:
    BandMatrix 5 1
    *  *  0  0  0
    *  *  *  0  0
    0  *  *  *  0
    0  0  *  *  *
    0  0  0  *  *
 */
public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) {
                    if (j != n - 1) System.out.print("*  ");
                    else System.out.print("*");
                } else {
                    if (j != n - 1) System.out.print("0  ");
                    else System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
