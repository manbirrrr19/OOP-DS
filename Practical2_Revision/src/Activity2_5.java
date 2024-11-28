public class Activity2_5 {
    public static void main(String[] args){
        int[] numlist = {-8, -1, 23, 54, 59, 71, 88};
        int key = 71;
        int ans = binarysearch(numlist,key);


        System.out.println("Index "+ans+" of the list, "+numlist[ans]+" is equal to the key, "+key);
    }
    public static int binarysearch(int[] numlist, int key){
        int left = 0, right = numlist.length-1;
        while(left<=right){
            int middle = left + (right-left)/2;
            if (numlist[middle] == key) {
                return middle;
            } else if (numlist[middle] < key) {
                left = middle + 1; // Search right half
            } else {
                right = middle - 1; // Search left half
            }
        }
        return -1; // target not found
    }
}
