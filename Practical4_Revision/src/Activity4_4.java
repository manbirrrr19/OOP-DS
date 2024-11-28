import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity4_4 {
    public static void main(String[] args) {
        Boat1 b = new Boat1("50","WhiteSand", "Sea", "Raffles Marina");
        Boat1 c = new Boat1("60","BlackSand", "Sea", "Raffles Marina");
        Boat1 d = new Boat1("70","BlueSand", "Sea", "Raffles Marina");
        Boat1 e = new Boat1("80","YellowSand", "Sea", "Raffles Marina");
        ArrayList<Boat1> boats = new ArrayList<>(Arrays.asList(b,c,d,e));
        boats.sort(new SortBoatList());
        for (int i = 0; i < boats.size(); i++) {
            Boat1 boat = boats.get(i); // Access the current Boat object
            System.out.println(boat.name); // Print the name of the current Boat
        }
    }
    public static void setModeOfTravel(Boat1 t){
        t.move();
    }
}

class Transportation1 {
    String speed;
    String name;
    String type; // land, sea or air

    public Transportation1(String speed, String name, String type) {
        this.speed = speed;
        this.name = name;
        this.type = type;
    }
    void move(){
        System.out.println ("Moving in "+ type + " at speed of " + speed);
    }

}
class Boat1 extends Transportation {
    String basePort;

    // complete the class
    public Boat1(String speed, String name, String type, String basePort) {
        super(speed, name, type);
        this.basePort = basePort;
    }

    void move() {
        System.out.println("Moving in " + type + " at speed of " + speed);
    }
}

class SortBoatList implements Comparator<Boat1> {
    @Override
    public int compare(Boat1 a,Boat1 b){
        return(a.name.compareTo(b.name));
    }
}