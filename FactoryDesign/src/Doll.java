public class Doll extends Toy{  //Doll is a toy
    public Doll(){ //sets the variable name in Toy to "Doll"
        name = "Doll";
    }
    public void assemble(){
        super.assemble(); //Does the assemble method in Toy
        System.out.println("Connecting all pieces\n" +
                "Painting the face\n" +
                "Adding the dress\n" +
                "Adding the shoes");
    }
}
