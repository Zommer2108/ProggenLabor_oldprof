package blatt07;

public class TernarySalutation {
    /**
     * Alle möglichen Grußformeln ausgeben
     */
    private static void testSalutation() {
        boolean bools[] = {true, false};
        for (boolean firstNameBase : bools) {
            for (boolean signature : bools) {
                System.out.println("\n..........<Mail-Text>..........\n"); // Platzhalter
                System.out.println(salutation(firstNameBase, signature, "Kim", "May", "Raum E502\nTel.: 01234/567890"));
                System.out.println("\n"); // Abstand zur uebersichtlichen Ausgabe
            }
        }
    }

    /**
     * Grußformeln abhängig vom Bekanntheitsgrad und wahlweise mit oder ohne Signatur ausgeben
     *
     * @param onFirstNameBase Per-Du?
     * @param signature       Signatur anfügen?
     * @param given           Vorname
     * @param name            Nachname
     * @param signatureText   Signatur
     * @return Grußformeln
     */
    static String salutation(boolean onFirstNameBase, boolean signature, String given, String name,
                             String signatureText) {

        String salutationFormality = onFirstNameBase ? "Viele Grüße \n" : "Mit freundlichen Grüßen \n";
        String fullName = onFirstNameBase ? given : given + " " + name;
        String signatur = signature ? signatureText : " ";

        return salutationFormality + "\n" + fullName +  "\n" + signatur;
    }

    public static void main(String[] args) {
        testSalutation();
    }
}
