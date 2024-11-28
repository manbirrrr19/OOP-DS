public class RunPrintMachine {
    public static void main(String[] args){
        PrintMachine printMachine = new PrintMachine();
        printMachine.copy("Hello!", 6);
        PrintMachine Canon = new PrintMachine();
        Canon.copy("Flying!", 6);
        PrintMachine Fujistu = new PrintMachine();
        Fujistu.copy("High!", 8);
    }
}

class PrintMachine{
    public static int totalNoOfCopy;
    String strText;
    int intNos;
    public String[] copy(String strText, int intNos){
        this.strText = strText;
        this.intNos = intNos;
        totalNoOfCopy += intNos;
        System.out.print("Total number of copies are: "+totalNoOfCopy+"\n");
        String[] copylist = new String[intNos];
        for(int i =0; i<=intNos-1;i++){
            copylist[i] = strText;
            System.out.print(copylist[i]+" ");
        }
        System.out.println("\n");
        return copylist;
    }
}
