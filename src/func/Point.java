package func;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point dest){
        double dist = 0;
        double deltaX = dest.x - this.x;
        double deltaY = dest.y - this.y;
        dist = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return dist; // find distance by formula
    }


    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
