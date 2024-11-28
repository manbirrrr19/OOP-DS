public class Dog extends HousePet
{
    protected int numberOfWalksPerDay;
    public Dog(){
//This calls HousePet() automatically.
        numberOfWalksPerDay = 2;
    }
    public Dog(String n, String o, String ff, int numWalks){
//We must explicitly call the HousePet() overloaded
//constructor, passing it the name, owner, and food info.
        super(n,o,ff);
        numberOfWalksPerDay = numWalks;
    }
    /*Here are the two methods that are abstract in the superclass, which
    are overriden here, thus making Dog a complete class*/
    public String where_I_Sleep(){
        return "Dog Bed";
        /*add codes here to implement the method—describe how a Dog sleep*/
    }
    public String how_I_Move(){
        return "all 4s";
        /*add codes here to implement the method—describe how a Dog move*/
    }
    public String toString(){
        String output = super.toString();
/*modify coded here to override toString method---provide
complete description of a Dog*/
        output = "My name is " +name+". My owner is "+owner+
                ". My favourtite food is "+favoriteFood+". I move on "+
                how_I_Move()+". I sleep on a "+where_I_Sleep();
        return output;
    }
}
