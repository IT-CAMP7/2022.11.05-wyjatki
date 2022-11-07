package pl.camp.it.wyjatki;

import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];

        for(int i = 0; i < 10; i++) {
            tab[i] = random.nextInt(101);
        }
    }
}
