import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of 4D for this draw: ");
        int count = sc.nextInt();
        Draw draw = new Draw(count);
        draw.generate4DList();
        draw.displayList();
    }
}

class Draw{
    int count;
    ArrayList<String> results = new ArrayList<>();
    public Draw(){
        count = 10;
    }
    public Draw(int count){
        this.count = count;
    }
    public String getSingle4D(){
        Random random = new Random();
        int Single4D = random.nextInt(999,10000);
        return String.valueOf(Single4D);
    }
    public void generate4DList(){
        for(int i =0;i<count;i++){
            results.add(getSingle4D());
        }
    }
    public void displayList(){
        System.out.println("1st: "+results.get(0));
        System.out.println("2nd: "+results.get(1));
        System.out.println("3rd: "+results.get(2));
        System.out.println("\nOthers:\n");
        int printcount = 0;
        for(int i=3;i< results.size();i++){
            if(printcount % 5 == 0){
                System.out.print("\n");
        }
            System.out.print(results.get(i)+" ");
            printcount++;
    }
}}