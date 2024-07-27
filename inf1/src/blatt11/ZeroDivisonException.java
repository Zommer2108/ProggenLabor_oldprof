package blatt11;

import java.util.Scanner;

public class ZeroDivisonException {

    /**
     * Zwei Werte dividieren
     *
     * @param z, Zahl die dividiert wird (Zähler)
     * @param n, Zahl durch die dividiert wird (Nenner)
     * @return z / n
     */
    public static int div(int z, int n) {
        final char aufrufezeichen = '"';
        int result = 0;

        try {
            result = z / n;
        } catch (ArithmeticException e) {
            System.err.println("Fehlergrund: " + aufrufezeichen + e.getMessage() + aufrufezeichen);
            e.printStackTrace();
            result = Integer.MAX_VALUE;
        } finally {
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Bitte Dividand eingeben: ");
        int z = userInput.nextInt();
        System.out.print("Bitte Divisor eingeben: ");
        int n = userInput.nextInt();

        System.out.println("Ergebnis: " + div(z, n));
        userInput.close();
    }
}
