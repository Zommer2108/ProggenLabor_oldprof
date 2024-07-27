package blatt05;

public class DreiChinesen {
    static final String text =
        "Drei Chinesen mit dem Kontrabass\n"
            + "saßen auf der Straße und erzählten sich was.\n"
            + "Da kam ein Mann: Ja was ist denn das?\n"
            + "Drei Chinesen mit dem Kontrabass.\n\n";

    /**
     * Einen Text zentriert ausgeben. Es genügt eine Lösung für nichtproportionale
     * Schriftarten.
     *
     * @param text Text mit mehreren Zeilen (durch '\n' abgetrennt)
     */
    static void printCentered(String text) {

        String[] splittedText = text.split("\n");

        //finding the longest line
        int maxLines = getMaxLines(splittedText);

        int length = 0;
        for (String lines : splittedText) {

            length = lines.length();
            int amountOfSpaces = (maxLines - length) / 2;
            final String spaces = "";

            if (amountOfSpaces != 0) {
                String alligned = "%" + amountOfSpaces + "s";
                System.out.printf(alligned, spaces);
            }
            System.out.println(lines);
        }
        System.out.printf("%n");
    }

    /**
     * Findet die längste Zeile in einem String Array
     * @param splittedText String Array
     * @return Längste Zeile
     */
    private static int getMaxLines(String[] splittedText) {
        int maxLines = 0;
        for (String lines : splittedText) {
            if (lines.length() > maxLines)
                maxLines = lines.length();
        }
        return maxLines;
    }

    /**
     * Vokale in Text ersetzen.
     *
     * @param text        Text mit Vokalen
     * @param replacement Ersatz für Vokale
     * @return Text mit geänderten Vokalen
     */
    static String changeVowels(String text, String replacement) {
        String vocals = "aeiouAEIOU";
        String newText = text.replaceAll("[" + vocals + "]", replacement);
        return newText;
    }

    public static void main(String[] args) {
        DreiChinesen.printCentered(text);
        DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
        DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "ü"));
    }
}
