import func.Point;
import func.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Note\\IdeaProjects\\Assaignment 1\\src\\source.txt"); // path to source file

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        //scans our source file to take coordinates and gives points to other files
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        //output of our results
        System.out.println("Average side: " + shape.getAverageSide());
        System.out.println("Longest side: " + shape.getLongestSide());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }
}