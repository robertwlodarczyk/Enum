package pl.wlodarczyk.robert.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login: ");
        String login = scanner.next();
        System.out.println("Podaj pierwszę imię: ");
        String firstname = scanner.next();
        System.out.println("Podaj email: ");
        String email = scanner.next();

        try {

            System.out.println(User.create(login, email, firstname));
        } catch (NullParemeterException | IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("Próba stworzenia użytkownika nie powiodłą się");
        } finally {
            System.out.println("Koniec programu");
        }


    }
}
