public class Comp {
    public Mouse mouse;
    public Keyboard keyboard;
    public Screen screen;
    public Unit unit;

    public Comp(Mouse mouse, Keyboard keyboard, Screen screen, Unit unit) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.screen = screen;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "mouse=" + mouse +
                ", keyboard=" + keyboard +
                ", screen=" + screen +
                ", unit=" + unit +
                '}';
    }
}
