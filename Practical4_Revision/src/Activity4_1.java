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

class ThreeDPoint extends TwoDPoint{
     private double z;
    public ThreeDPoint(double x, double y, double z){
        super(x,y);
        this.z = z;
    }
    public ThreeDPoint(){
        super();
        z = 0;
    }
    public double getZ(){
        return z;
    }
    public double getDistance(ThreeDPoint remotePoint){
        double dist = Math.sqrt(Math.pow((remotePoint.getX()- getX()), 2) + Math.pow((remotePoint.getY()- getY()), 2) + Math.pow((remotePoint.getZ()- z), 2));
        return dist;
    }
}

public class Activity4_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("Enter y: ");
        double y = sc.nextDouble();
        System.out.println("Enter y: ");
        double z = sc.nextDouble();
        ThreeDPoint point1 = new ThreeDPoint(x,y,z);
        ThreeDPoint point2 = new ThreeDPoint();
        double distance = point1.getDistance(point2);
        distance = Math.round(distance*100.0)/100.0;
        System.out.println("The distance between both the 2 points are "+distance);
    }
}
