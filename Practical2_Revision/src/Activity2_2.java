public class Activity2_2 {
    public static void main(String[] args){
        int randomval = (int) (Math.random()*1000);
        System.out.println("Random value is "+randomval);
        reverse(randomval);
    }
    public static int reverse(int number){
        int digit, reversed = 0;
        while (number != 0) {
            digit = number % 10;      // Extract the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            number = number / 10;        // Remove the last digit
        }
        System.out.println("The reversed value is "+reversed);
        return reversed;
}}
