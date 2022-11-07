package pl.camp.it.wyjatki;

import java.sql.Array;

public class App {
    public static void main(String[] args) {
        a(234523);
        System.out.println("KONIEC PROGRAMU !!");
        c(2);
    }

    public static void a(int i) {
        b(i);
    }

    public static void b(int i) {
        c(i);
    }

    public static void c(int i) {
        int[] tab = new int[5];
        try {
            //???
            System.out.println(tab[i]);
            //???
        } catch(ArrayIndexOutOfBoundsException |
                NullPointerException |
                IllegalArgumentException wyjatek) {
            System.out.println("cos sie stalo");
            wyjatek.printStackTrace();
            System.out.println(wyjatek.getCause());
            System.out.println(wyjatek.getMessage());
        } finally {
            System.out.println("cos tam");
        }
    }
}
