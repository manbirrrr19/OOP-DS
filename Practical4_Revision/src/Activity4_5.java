import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Activity4_5 {
    public static void main(String[] args){
        ArrayList<Character> a1 = new ArrayList( Arrays.asList('r','P','t','w'));
        System.out.println (getMaximum2(a1));
        ArrayList<Float> a2 = new ArrayList( Arrays.asList(111f,-99f,888f,333f));
        System.out.println (getMaximum2(a2));
        ArrayList<String> a3 = new ArrayList( Arrays.asList("SP","SG","EEE","DCPE"));
        System.out.println (getMaximum2(a3));
    }

    public static <E extends Comparable<E>> E getMaximum(ArrayList<E> x) {
        // complete the code to return the maximum
        E max = x.getFirst();
        for(int i = 1; i < x.size() ; i++){
            if(x.get(i).compareTo(max) > 0){
                max = x.get(i);
            }
        }
        return max;
    }
    public static <E extends Comparable<E>> E getMaximum2(ArrayList<E> x) {
        // complete the code to return the maximum
        return Collections.max(x);
    }
}
