package idv.carl.di.lab.spring5dilab.solid.interfacesegregationpriciple.good;

/**
 * @author Carl Lu
 */
public class ToyCar implements Toy, Movable {

    private double price;
    private String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("ToyCar: Start moving car.");
    }

    @Override
    public String toString() {
        return "ToyCar: Moveable Toy car- Price: " + price + " Color: " + color;
    }

}
