public class Activity4_2 {
    public static void main(String[] args) {
        Rose r = new Rose ("Pink","Damascus","Majolica","Happiness");
        r.getRose();
    }
}

class Flower {
    String color;
    String origin;
    public Flower(String color, String origin) {
        this.color = color;
        this.origin = origin;
    }
}
class Rose extends Flower {
    String name;
    String meaning;
// complete the constructor
    public Rose(String name, String meaning, String color, String origin){
        super(color,origin);
        this.name = name;
        this.meaning = meaning;
    }
    public void getRose(){
        System.out.println("Its name is "+name+". Its meaning is "+meaning+". Its color is "+color+". Its origin is "+origin+".");
    }
}
