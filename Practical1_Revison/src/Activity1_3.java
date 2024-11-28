import java.util.ArrayList;
import java.util.Scanner;

public class Activity1_3 {
    public static void main(String[] args){
        ArrayList<Integer> Numlist = new ArrayList<>();
        while(true){
            int i;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            i = sc.nextInt();
            if(i==0){
                break;
            }
            Numlist.add(i);
        }
        int sum = 0;
        for(int x=0;x<Numlist.size();x++){
            sum+=Numlist.get(x);
        }
        float avg = (float) sum /Numlist.size();
        System.out.println("The average is "+avg);
    }
}
