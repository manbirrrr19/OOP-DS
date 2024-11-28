public class Q1 {
    public static void main(String[] args) {
        try {
            Object x = new Object();
            Integer y = (Integer) x;
        }
        catch (ClassCastException e) {
            System.out.println("Error: Cannot cast Object to Integer. " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("There is an error");
            System.out.println(e.getMessage());
        }
    }
}
