import java.util.Scanner;

public class Activity1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you mark: ");
        int mark = sc.nextInt();
        do{
            System.out.println("Enter a valid mark: ");
            mark = sc.nextInt();
            if(mark == -1){
                System.exit(0);
            }
        }while(mark <0 || mark >100);
        String grade = "";
        if (mark >= 80 && mark <= 100){
            grade = "A";
        } else if (mark >= 70 && mark <= 79) {
            grade = "B";
        } else if (mark >= 60 && mark <= 69) {
            grade = "C";
        } else if (mark >= 50 && mark <= 59) {
            grade = "D";
        } else if (mark >= 0 && mark <= 49) {
            grade = "F";
        }
        System.out.println("Your grade is "+ grade);

            
        }
    }

