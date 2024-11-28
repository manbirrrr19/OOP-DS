import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Q4 {
    public static void main(String[] args){
    int Class_Size = 5;
    ArrayList<String> classlist = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
    OOP3A22Seating class1 = new OOP3A22Seating(Class_Size, classlist);
    class1.generateSeating();
    class1.displaySeating();
}}


class OOP3A22Seating{
    int size;
    ArrayList<String> classlist;
    ArrayList<String> newClass = new ArrayList<>();
    public OOP3A22Seating(int size, ArrayList<String> classlist){
        this.size = size;
        this.classlist = classlist;
    }
    public ArrayList<String> generateSeating(){
        for (int i=0;i<size;i++) {
            Random random = new Random();
            int seat = random.nextInt(size);
            String seat_name = classlist.get(seat);
            while(newClass.contains(seat_name)){
                seat = random.nextInt(size);
                seat_name = classlist.get(seat);
            }
            newClass.add(seat_name);
        }
        return newClass;
    }
    public void displaySeating(){
        for (int i=0;i<newClass.size();i++) {
            System.out.print(newClass.get(i)+" ");
        }
    }
}
