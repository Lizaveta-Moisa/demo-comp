public class Unit {
    public String brand;
    public String colour;

    public Unit(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
