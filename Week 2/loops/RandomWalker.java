/*
    La clase RandomWalker recibe un entero r que
    representa la "distancia Manhattan" (suma de
    valores absolutos de cada componente espacial)
    y genera un proceso aleatorio de pasos (con la
    misma probablidad de moverse en las cuatro dir.
    cardinales, iniciando en (0, 0) y teniendo como
    meta (x, y), tal que |x| + |y| > r.
 */
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int num_steps = 0;
        int x = 0;
        int y = 0;
        int mDistance = 0;
        double rand;
        System.out.println("(" + x + ", " + y + ")");
        while (mDistance < r) {
            rand = Math.random();
            if (rand < .25) x++;
            else if (rand < .5) x--;
            else if (rand < .75) y++;
            else y--;
            num_steps++;
            mDistance = Math.abs(x) + Math.abs(y);
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + num_steps);
    }
}
