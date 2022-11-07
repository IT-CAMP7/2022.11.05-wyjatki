package pl.camp.it.wyjatki;

public class App3 {
    public static void main(String[] args) {
        try {
            metoda();
        } catch (IncorrectSideException e) {
            System.out.println("gotowe !!");
        }
    }

    public static void metoda() throws IncorrectSideException {
        Square square = new Square(-5);

        System.out.println(square.getSide());
    }
}
