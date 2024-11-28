import java.util.ArrayList;

public class Activity5_4 {
    public static void main(String[] args) {
        ArrayList<VendingMachine> vmGroup = new ArrayList<>();
        CoinVendingMachine v1 = new CoinVendingMachine();
        vmGroup.add(v1);
        CoinNoteVendingMachine v2 = new CoinNoteVendingMachine();
        vmGroup.add(v2);

        for(int i = 0; i < vmGroup.size(); i++){
            printInstruction(vmGroup.get(i));
        }

    }
    public static void printInstruction (VendingMachine v) {
        v.printGuide();
    }
}

interface VendingMachine{
    public void printGuide();
}

class CoinVendingMachine implements VendingMachine{
    public void printGuide (){
        System.out.println("This machine accepts coins only.");
        System.out.println("Drop in coins.");
        System.out.println("Select item.");
        System.out.println("Press GO button.");
    }
}

class CoinNoteVendingMachine implements VendingMachine{
    public void printGuide () {
        System.out.println("This machine accepts coins and notes.");
        System.out.println("Drop in coins and insert notes.");
        System.out.println("Select item.");
        System.out.println("Press GO button.");
    }
}