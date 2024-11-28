import java.util.Scanner;

class TwoDPoint{
    double x,y;
    public TwoDPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public TwoDPoint(){
        x = 0;
        y = 0;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getDistance(TwoDPoint remotepoint){
        double x1 = x;  //refers to 2DPoint alrdy so x is in
        double y1 = y; //refers to 2DPoint alrdy so y is in
        double x2 = remotepoint.getX();
        double y2 = remotepoint.getY();
        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return distance;
    }
}

public class TestTwoDPoint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("Enter y: ");
        double y = sc.nextDouble();
        TwoDPoint point1 = new TwoDPoint(x,y);
        TwoDPoint point2 = new TwoDPoint();
        double distance = point1.getDistance(point2);
        System.out.println("The distance between both the 2 points are "+distance);
    }
}
