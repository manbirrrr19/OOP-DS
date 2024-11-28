public class Activity2_4 {
    public static void main(String[] args){
        //int[] numlist = {88,-8,-1,59,54,71,23};
        int[] numlist = {59, -1, 54, 23, -8, 71, 88, 200};
        for (int i=0;i< numlist.length-1;i++){
            for(int j=0;j< numlist.length-1;j++){
                if(numlist[j]>numlist[j+1]){
                    int newval = numlist[j];
                    numlist[j] = numlist[j+1];
                    numlist[j+1]=newval;
                }
            }
        }
        for(int i=0;i< numlist.length;i++){
            System.out.println(numlist[i]);
        }
    }
}
