public class Keyboard {
    public String colour;
    public String brand;

    public Keyboard(String colour, String brand) {
        this.colour = colour;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
