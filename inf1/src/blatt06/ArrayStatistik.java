package blatt06;

import java.util.Arrays;

public class ArrayStatistik {
    public static void main(String[] args) {
        int[] array = {35, 7, 90, 26, 92, 54, 24, 65, 2, 67, 43, 26, 80, 92, 7, 40, 67,
            66, 31, 45, 7, 100, 96, 93, 12, 20, 57, 22, 62, 51};
        double[][] kfzTable = new double[][]{{0, 74.4}, {-350, 18.2}, {-1500, 6.1}, {-5000, 1.3}};
        int min = array[0];
        int max = array[0];
        int anzahl = array.length;
        int sum = 0;
        double expectedResult = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        Arrays.sort(array);
        double average = (double) sum / anzahl;

        for(int i = 0 , j = 0; i < kfzTable.length; i++, j++) {
            if(j > 0) {
                j = 0;
            }
            expectedResult += kfzTable[i][j] * kfzTable[i][j+1];
        }

        System.out.println("Durchschnitt: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("summe: " + sum);
        System.out.println("Anzahl: " + anzahl);
        System.out.println();
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Erwartungswert: " + expectedResult);
    }
}
