import java.util.Scanner;

public class Activity1_4 {
    public static void main(String[] args){
        String name[] = new String[3];
        int age[] = new int[3];
        String school[] = new String[3];
        int i=1;
        do {
            Scanner sc = new Scanner(System.in);
// complete the program
            System.out.println("Enter name " + i+": ");
            name[i-1] = sc.nextLine();
            System.out.println("Enter age " + i+": ");
            age[i-1] = sc.nextInt();
            System.out.println("Enter school " + i+": ");
            sc.nextLine();
            school[i-1] = sc.nextLine();
            i++;
        } while (i<=3);
// display students’ info
        for(i=1;i<4;i++) {
            System.out.println("Student "+i+": "+name[i-1]+", "+age[i-1]+", "+school[i-1]);
        }
    }
}
