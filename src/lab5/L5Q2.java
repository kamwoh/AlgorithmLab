package lab5;

import java.util.Arrays;

public class L5Q2 {

    public static void main(String[] args)
    {
        int[][] wellsCoordinate = {{-8,23},
            {-5,71},
            {1,64},
            {5,14},
            {7,98},
            {11,45},
            {13,33},
            {18,56},
            {21,3}
        };
        int[] medians = findMedian(wellsCoordinate);
        if (wellsCoordinate.length % 2 == 1)
            System.out.println("optimal location of the main pipeline\nshould be median\ny = "+medians[0]);
        else
            System.out.println("optimal location of the main pipeline\nshould between lower and upper median\nlowerY = "+medians[0]+"\nupperY = "+medians[1]);
    }
    
    public static int[] findMedian(int[][] wellsCoordinate)
    {
        int[] y_coordinates = new int[wellsCoordinate.length];
        for(int i=0;i<y_coordinates.length;i++)
        {
            y_coordinates[i] = wellsCoordinate[i][1];
        }
        Arrays.sort(y_coordinates, 0, y_coordinates.length);
        System.out.println("wells sorted y coordinates");
        System.out.println(Arrays.toString(y_coordinates));
        int median = y_coordinates[y_coordinates.length/2];
       
        if (y_coordinates.length % 2 == 1)
        {
            return new int[]{median};
        }
        else
        {
            int upperMedian = y_coordinates[y_coordinates.length/2+1];
            return new int[]{median,upperMedian};
        }
        
    }

}
