public class Activity2_1 {
    public static void main(String[] args){
        System.out.println("Degree   Sin     Cos    ");
        for(int degree = 0;degree<=360;degree+=10){
            double radianval = Math.toRadians(degree);
            double sinval = Math.sin(radianval);
            double cosval = Math.cos(radianval);
            sinval = Math.round(sinval*10000.0)/10000.0;
            cosval = Math.round(cosval*10000.0)/10000.0;
            System.out.println(degree+"    "+sinval+"   "+cosval);
        }
    }
}
