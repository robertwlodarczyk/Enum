package pl.wlodarczyk.robert.Random;

import java.util.Random;

public class RandomClass {

    public int generate() {

        class Numbers {
            int a;
            int b;
            int c;

        }

        Numbers numbers = new Numbers();
        numbers.a = new Random().nextInt();
        numbers.b = new Random().nextInt();
        numbers.c = new Random().nextInt();

        return ((numbers.a + numbers.b + numbers.c) / 3);
    }


}

