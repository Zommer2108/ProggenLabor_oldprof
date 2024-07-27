package blatt03;

import java.lang.Math;

public class SchleifenUebung {

    public static void main(String[] args) {

        double result = 0;
        double resultSin = 0;
        double resultCos = 0;
        double schritte = 0;
        final int STARTWERT = -4;
        final int ENDWERT = 4;
        final double SCHRITTWEITE = 0.5;

        System.out.println("Alle Quadratzahlen von -4 ... 4 in 0.5er-Schritten: ");
        for (schritte = STARTWERT; schritte <= ENDWERT; schritte += SCHRITTWEITE) {

            result = schritte;
            result = Math.pow(result, 2);
            System.out.println("x, x^2: " + schritte + ", " + result);
        }

        System.out.println();
        System.out.println("Alle Sinus, Cosinus von -4 ... 4 in 0.5er-Schritten: ");

        for (schritte = STARTWERT; schritte <= ENDWERT; schritte += SCHRITTWEITE) {
            result = schritte;
            resultSin = Math.sin(result);
            resultCos = Math.cos(result);
            System.out.println("x, sin(x), cos(x): " + schritte + ", " + resultSin + ", " + resultCos);
        }
    }
}
