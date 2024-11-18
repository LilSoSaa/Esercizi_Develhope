package SwitchStatement;

import java.util.Scanner;

//Scrivi un programma che contenga un metodo che prende in ingresso
// un valore numerico e restituisca il nome del giorno della settimana
// come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
public class SwitchStatement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero compreso tra 1 e 7: ");
        int day = scanner.nextInt();

        System.out.println(getDayName(day));
        scanner.close();
    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";

            default:
                return "Numero inserito non rientra tra i numeri possibili";
        }
    }
}
