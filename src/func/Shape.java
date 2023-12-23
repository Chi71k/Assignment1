package func;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point); // add points from source to array
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            perimeter += currentPoint.distance(nextPoint); // by taking distances calculated from point.java we + them and find P
        }

        perimeter += points.get(size - 1).distance(points.get(0)); // + the distance which was not checked by loop
        return perimeter;
    }

    public double getAverageSide() {
        double totalLength = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            totalLength += currentPoint.distance(nextPoint); // take length like in P
        }

        totalLength += points.get(size - 1).distance(points.get(0));
        return totalLength / size; // divide the length by number off walls and took avr
    }

    public double getLongestSide() {
        double maxLength = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            double currentLength = points.get(i).distance(points.get(i + 1)); //we take points from array and find distance with point.java
            maxLength = Math.max(maxLength, currentLength); //we compare this distances and find max one
        }

        maxLength = Math.max(maxLength, points.get(size - 1).distance(points.get(0))); // finally we compare maxlength from loop and those that not from loop
        return maxLength;
    }
}
