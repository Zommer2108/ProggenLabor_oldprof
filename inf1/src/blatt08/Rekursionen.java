package blatt08;

import java.util.Scanner;

/**
 * @author Roman Zimmer
 * @version 1.0
 */
public class Rekursionen {
    public static void prt1234(long n) {
        if (n > 0) {
            prt1234(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void prtSqrt1234(long n) {
        if (n > 0) {
            prtSqrt1234(n - 1);
            n *= n;
            System.out.print(n + " ");
        }
    }
    public static void prt2468(long n) {

        if (n % 2 == 0 && n > 0) {
            prt2468(n - 1);
            System.out.print(n + " ");
        }

        if(n % 2 == 1) {
            prt2468(n - 1);
        }
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        prt1234(n);
        System.out.println();

        prtSqrt1234(n);
        System.out.println();

        prt2468(n);
    }
}
