package blatt08;

import static blatt08.KartenFarbe.farbenWert;
import static java.lang.Math.sqrt;

/**
 * @author Roman Zimmer
 * @version 1.0
 */
public class MethodenUebung {
    /**
     * Method to print the absolute value of a number.
     * @param number the number to print the absolute value of
     * @return the absolute value of the number
     */
    public static double absoluteValue(double number) {

        if (number < 0) {
            return number *= -1;
        }
        return number;
    }

    /**
     * Method to round any number up
     * @param number the number to round up
     * @return the rounded up number as an Integer
     */
    public static int roundUpToInt(double number) {

        final double ROUND_UP = 0.5;
        if (number < 0) {
            return (int) (number - ROUND_UP);
        }
        return (int) (number + ROUND_UP);
    }

    /**
     * Method to round any number down
     * @param number the number to round down
     * @return the rounded down number as an Integer
     */
    public static int roundDownToInt(double number) {

        final double ROUND_DOWN = -0.5;
        if (number < 0) {
            return (int) (number - ROUND_DOWN);
        }
        return (int) (number + ROUND_DOWN);
    }

    /**
     * Method to test if a number is dividable by another number without remainder
     * @param dividend the number to test
     * @param divider the number to test against
     * @return true if the number is dividable by the divider, false otherwise
     */
    public static boolean dividable(double dividend, double divider) {

        if (dividend % divider == 0) {
            return true;
        }
        return false;
    }

    /**
     * Method to calculate the distance between two points
     * @param p1 the first point
     * @param p2 the second point
     * @return the distance between the two points
     */
    public static double euclideanDistance(Point p1, Point p2) {

        return sqrt((Math.pow((p2.getXValue() - p1.getXValue()), 2.0)) +
            Math.pow((p2.getYValue() - p1.getYValue()), 2.0));
    }

    /**
     * Method to find the smallest number out of three
     * @param number1 the first number
     * @param number2 the second number
     * @param number3 the third number
     * @return the smallest number
     */
    public static double findSmallestNumber(double number1, double number2, double number3) {
        double smallestNumber;
        smallestNumber = Math.min(number1, number2);
        smallestNumber = Math.min(smallestNumber, number3);

        return smallestNumber;
    }

    public static void main(String[] args) {
        double testwert1 = 8;
        double testwert2 = 8;
        double testwert3 = -8.5;

        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);

        System.out.println("Betrag-Methode Test: " + testwert3);
        System.out.println(absoluteValue(testwert3));
        System.out.println();

        System.out.println("Aufrunden-Methode Test: " + testwert3);
        System.out.println(roundUpToInt(testwert3));
        System.out.println();

        System.out.println("Abrunden-Methode Test: " + testwert3);
        System.out.println(roundDownToInt(testwert3));
        System.out.println();

        System.out.println("Divisibility-Methode Test: " + testwert1 + " und " + testwert2);
        System.out.println(dividable(testwert1, testwert2));
        System.out.println();

        System.out.println("Euklidische Distanz-Methode Test: " + p1.showPoint() + " und " + p2.showPoint());
        System.out.println(euclideanDistance(p1, p2));
        System.out.println();

        System.out.println("Min-Methode Test: " + testwert1 + ", " + testwert2 + ", " + testwert3);
        System.out.println(findSmallestNumber(testwert1, testwert2, testwert3));
        System.out.println();

        System.out.println("Farbenwert Pik: " + farbenWert(KartenFarbe.PIK));
        System.out.println("Farbenwert Herz: " + farbenWert(KartenFarbe.HERZ));
        System.out.println("Farbenwert Kreuz: " + farbenWert(KartenFarbe.KREUZ));
    }
}
