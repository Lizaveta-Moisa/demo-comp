public class Screen {
    public int length;
    public int width;
    public String brand;

    public Screen(int length, int width, String brand) {
        this.length = length;
        this.width = width;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "length=" + length +
                ", width=" + width +
                ", brand='" + brand + '\'' +
                '}';
    }
}
