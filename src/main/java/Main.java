public class Main {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("LG", "Black", 10);
        Mouse mouse2 = new Mouse("Honor", "White", 15);

        Keyboard keyboard1 = new Keyboard("White", "LG");
        Keyboard keyboard2 = new Keyboard("Black", "Asus");

        Screen screen1 = new Screen(10, 15, "LG");
        Screen screen2 = new Screen(12,14, "Asus");

        Unit unit1 = new Unit("LG", "White");
        Unit unit2 = new Unit("Asus", "Green");

        Comp comp1 = new Comp(mouse1, keyboard1, screen1, unit1);
        Comp comp2 = new Comp(mouse2, keyboard2, screen2, unit2);

        System.out.println("Первый компьютер - " + comp1);
        System.out.println("Второй компьютер - " + comp2);
    }
}
