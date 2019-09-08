/*
    La clase RandomWalkers corre un experimento de
    Monte Carlo donde el primer entero ingresado es
    la "distancia de Manhattan" (r) y el segundo el número
    de pruebas a correr. Regresa el número de pasos en
    promedio que da un random walker para salir del espacio
    definido por r.
 */
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        long total_steps = 0;
        int num_steps, x, y, mDistance;
        double rand, avg;
        for (int i = 0; i < trials; i++) {
            num_steps = 0;
            x = 0;
            y = 0;
            mDistance = 0;
            while (mDistance < r) {
                rand = Math.random();
                if (rand < .25) x++;
                else if (rand < .5) x--;
                else if (rand < .75) y++;
                else y--;
                num_steps++;
                mDistance = Math.abs(x) + Math.abs(y);
            }
            total_steps += num_steps;
        }
        avg = (double) total_steps / (double) trials;
        System.out.println("average number of steps = " + avg);
    }
}
