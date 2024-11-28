public class Q2 {
    public static void main(String args[]){

    }
}

interface Transportation {
    public void Move();
}
class LandTransport implements Transportation {
    double speed;
    LandTransport(double speed) {
        speed = speed;
    }
    public void Move() {
        System.out.println("Moving on land");
    }
}
class LRT extends LandTransport {
    LRT(double speed) {
        super(speed);
    }

    public void Move() {
        System.out.println("Moving on rail tracks");
    }
}
