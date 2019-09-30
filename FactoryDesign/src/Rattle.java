public class Rattle extends Toy {
    public Rattle(){
        name = "Rattle";
    }
    public void assemble(){
        super.assemble();
        System.out.println("Create the frame\n" +
                "Add the pebbles\n" +
                "Secure the sides");
    }
}