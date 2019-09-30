public abstract class Toy {
    protected String name; //instance variable
    //methods to print out actions for toy
    public void assemble(){
        System.out.println("Putting together a "+ name);
    }
    public void boxToy(){
        System.out.println("putting the " + name +" in the box");
    }
    public void priceToy(){
        System.out.println("Adding price on "+name);
    }
}
