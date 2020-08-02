package pl.wlodarczyk.robert.Kalkulator;

import pl.wlodarczyk.robert.Kalkulator.Kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        // Kalkulator

        Scanner scanner = new Scanner(System.in);

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Podaj pierwszą liczbę: ");
        kalkulator.setLiczba1(scanner.nextInt());
        System.out.println("Podaj drugą liczbę: ");
        kalkulator.setLiczba2(scanner.nextInt());
        System.out.println("Podaj rodzaj działania: ");

        String znak = scanner.next();

        for (Działania value : Działania.values()) {
            if (value.getSign().equals(znak)) {
                kalkulator.setTyp(value);
            }

        }

        int obliczenia = kalkulator.obliczenia();

        System.out.println(obliczenia);

    }
}
