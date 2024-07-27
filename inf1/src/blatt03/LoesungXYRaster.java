package blatt03;


import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungXYRaster extends JFrame {

    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungXYRaster() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(604, 417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungXYRaster();
    }


    /**
     * Paint-Methode. Nichts zu ändern hier. Diese Methode
     * wird beim Öffnen des Fensters automatisch aufgerufen.
     * Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     * verändert wird.
     *
     * @param g Grafik, auf die gezeichnet wird.
     */
    public void paint(Graphics g) {
        /* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
        g.clearRect(0, 0, this.getWidth(), this.getHeight());


        this.meinRaster(g); // Aufruf der selbst programmierten Methode
    }

    /**
     * Hier bitte die Lösung, um das Raster zu zeichnen
     */
    public void meinRaster(Graphics g) {
        int x25 = this.getWidth() / 4;
        int y25 = this.getWidth() / 4;
        int x75 = this.getWidth() * 3 / 4;
        int y75 = this.getHeight() * 3 / 4;
        final int NUMBER_OF_LINES = 11;

        //Distances between the lines in their axis
        int distanceLinesX = (x75 - x25) / NUMBER_OF_LINES;
        int distanceLinesY = (y75 - y25) / NUMBER_OF_LINES;

        //Limits of the final box
        int xLimit = x25 + distanceLinesX * NUMBER_OF_LINES;
        int yLimit = y25 + distanceLinesY * NUMBER_OF_LINES;

        //linecounter for odd and even lines
        int lineCounter = 1;

        //declaration and iteration of all the new points for the new box
        for (int xOneNew = x25, yOneNew = y25; xOneNew < xLimit;
             xOneNew += distanceLinesX, yOneNew += distanceLinesY) {

            if (lineCounter % 2 == 0) {
                g.setColor(Color.LIGHT_GRAY);
            } else {
                g.setColor(Color.BLACK);
            }

            g.drawLine(xOneNew, y25, xOneNew, yLimit - distanceLinesY);
            g.drawLine(x25, yOneNew, xLimit - distanceLinesX, yOneNew);
            lineCounter++;
        }
    }
}
