public class Car extends Toy {
    public Car(){
        name = "Car";
    }
    public void assemble(){
        super.assemble();
        System.out.println("Make the body\n" +
                "Add the wheels\n" +
                "Paint the car");
    }
}
