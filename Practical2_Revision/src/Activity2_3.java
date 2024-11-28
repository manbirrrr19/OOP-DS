public class Activity2_3 {
    public static void main(String[] args){
        String a[] = {"aaa","qqq","AAA","QQQ"};
        for(int i = 0;i< a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if (a[j].compareTo(a[j+1])>0){
                    String newval = a[j];
                    a[j] = a[j+1];
                    a[j+1]=newval;
                }
            }
        }
        for(int i = 0;i< a.length;i++){
            System.out.println(a[i]);}
    }
}
