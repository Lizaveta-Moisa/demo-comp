public class Mouse {
    public String brand;
    public String colour;
    public int size;

    public Mouse(String brand, String colour, int size) {
        this.brand = brand;
        this.colour = colour;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                '}';
    }
}
