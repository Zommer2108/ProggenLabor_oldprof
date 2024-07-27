package blatt08;

/**
 * @author Roman Zimmer
 * @version 1.5
 *
 *         This class represents a point in 2D space.
 */
public class Point {

    private double xValue;
    private double yValue;

    /**
     * Constructor for the Point class.
     * @param xValue the x-coordinate of the point
     * @param yValue the y-coordinate of the point
     */
    Point(double xValue, double yValue) {
        this.xValue = xValue;
        this.yValue = yValue;
    }

    /**
     * Getter for the x-coordinate of the point.
     * @return the x-coordinate of the point
     */
    public double getXValue() {
        return this.xValue;
    }

    /**
     * Getter for the y-coordinate of the point.
     * @return the y-coordinate of the point
     */
    public double getYValue() {
        return this.yValue;
    }

    /**
     * Shows the x and y-coordinates of a point.
     * @return the x and y-coordinates of a point
     */
    public String showPoint() {
        return "(" + this.xValue + ", " + this.yValue + ")";
    }
}
