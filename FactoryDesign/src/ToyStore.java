public class ToyStore{
    public Toy orderToy(String type){ //method to order/create toy
        Toy toy= null;
        //cases for setting toy equal to whatever type user inputs
        if(type.equalsIgnoreCase("Doll")) {
            toy = new Doll();
            toy.assemble();
            toy.boxToy();
            toy.priceToy();
        }
        if(type.equalsIgnoreCase("Car")) {
            toy = new Car();
            toy.assemble();
            toy.boxToy();
            toy.priceToy();
        }
        if(type.equalsIgnoreCase("Rattle")) {
            toy = new Rattle();
            toy.assemble();
            toy.boxToy();
            toy.priceToy();
        }
        return toy;
    }
}
