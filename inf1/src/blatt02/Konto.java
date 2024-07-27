package blatt02;

import java.util.Scanner;

public class Konto {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double sparziel = 0;
        double minuszins = 0;
        double guthaben;
        double zins;
        final double ANLAGE = 1000.0;
        int jahre = 0;
        final int PROZENT = 1;

        System.out.println("Bitte entscheiden Sie welche der folgenden Berechnung Sie ausführen möchten:");
        System.out.println("1) Sparplan mit Zinseszins");
        System.out.println("2) Sparplan ohne Zinseszins");
        System.out.println("3) Erforderliche Dauer eines Sparziels mit Zinseszins");
        System.out.println();
        System.out.print("Ihre Auswahl:");
        int modus = userInput.nextInt();

        System.out.print("Bitte geben Sie Ihr Startguthaben ein: ");
        guthaben = userInput.nextDouble();
        System.out.print("Bitte geben Sie den Zinssatz (in %) ein: ");
        zins = userInput.nextDouble();

        if (modus == 3) {
            System.out.print("Bitte geben Sie ihr Sparziel ein: ");
            sparziel = userInput.nextInt();
        } else {
            System.out.print("Bitte geben Sie die Laufzeit (in Jahren) ein: ");
            jahre = userInput.nextInt();
        }

        System.out.println();

        switch (modus) {
            case 1:
                //TM1: 1. Sparplan von Roman Zimmer

                for (int i = 0; i < jahre; i++) {
                    guthaben *= (PROZENT + (zins / 100.0));
                    guthaben += ANLAGE;
                    System.out.println("Guthaben nach dem " + (i + 1) + ". Jahr: " + guthaben);
                }
                break;

            case 2:
                //TM2: 2. Sparplan von Mirco

                for (int i = 1; jahre >= i; i++) {
                    double vorjahresZins = minuszins;
                    minuszins = vorjahresZins + guthaben * (zins / 100);
                    guthaben += guthaben * (zins / 100);
                    guthaben = guthaben - minuszins + vorjahresZins;
                    guthaben += 1000;
                    double guthabenMitZins = guthaben + minuszins;
                    System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthabenMitZins);
                }
                break;

            case 3:
                //TM1 3. Sparplan von Roman;

                while (guthaben < sparziel) {
                    guthaben *= (PROZENT + (zins / 100.0));
                    guthaben += ANLAGE;
                    jahre++;
                }

                System.out.println("Guthaben nach dem " + jahre + ". Jahr: " + guthaben);
                break;

            default:
                System.out.println();
                System.out.println("Ungültige Eingabe");
                break;
        }
        userInput.close();
    }
}
