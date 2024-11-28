import java.util.Random;

public class TestDie {
    public static void main(String[] args){
        Die die = new Die(6);
        System.out.println("The value rolled is: "+die.roll());
    }
}

class Die{
    int maxFace;
    public Die(int maxFace){
        this.maxFace = maxFace;
    }
    public int roll(){
        Random random = new Random();
        int rollednum = random.nextInt(maxFace)+1;
        return rollednum;
    }
}