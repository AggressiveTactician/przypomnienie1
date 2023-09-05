package com.anewhope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;

        Party party = new Party();

        while(shouldContinue) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();

//            switch nowego typu (od Java 12)
//
//            switch (userChoice) {
//                case 1 -> System.out.println("Wybrano 1");
//                case 2 -> System.out.println("Wybrano 2");
//                case 3 -> System.out.println("Wybrano 3");
//                case 4 -> System.out.println("Wybrano 4");
//                case 5 -> shouldContinue = false;
//            }


            switch (userChoice) {
                case 1:
                    party.displayGuests();
                    break;
                case 2:
                    party.addGuest();
                    break;
                case 3:
                    party.displayMeals();
                    break;
                case 4:
                    party.displayGuestByPhoneNumber();
                    break;
                case 5:
                    shouldContinue = false;
            }
        }

    }
}