public class Activity1_1 {
    public static void main(String[] args){
        int a = 1;
        System.out.println("a is " + a);
        int b = 2;
        System.out.println("b is " + b);
        int a_store = a;
        a = b;
        System.out.println("New a is " + a);
        b = a_store;
        System.out.println("New b is " + b);

    }
}
