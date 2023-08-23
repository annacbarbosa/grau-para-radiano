import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author anna.cbarbosa
 */
class Main {

    public static void main(String[] args) {
        float deg;
        String resposta;
        Scanner inp = new Scanner(System.in);

        do {
            do {
                System.out.println("Informe um valor entre 0 e 360°: ");
                deg = inp.nextFloat();
            } while (deg < 0 || deg > 360);

            System.out.println("Valor em radianos: " + Math.toRadians(deg) / Math.PI + " PI");
            System.out.println("Deseja continuar? Se não, digite 'N' ");
            resposta = inp.next();
            resposta = resposta.toUpperCase();

        } while (!resposta.equals("N"));
    }
}
