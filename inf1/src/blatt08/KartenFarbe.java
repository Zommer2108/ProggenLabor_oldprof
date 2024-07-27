package blatt08;

/**
 * @author Roman Zimmer
 * @version 1.0
 */
public enum KartenFarbe {
    KARO, HERZ, PIK, KREUZ;
    static int farbenWert(KartenFarbe farbe) {
        int returnValue;

        switch (farbe) {
            case KARO:
                returnValue = 9;
                break;

            case HERZ:
                returnValue = 10;
                break;

            case PIK:
                returnValue = 11;
                break;

            default:
                returnValue = 12;
                break;
        }
        return returnValue;
    }
}
