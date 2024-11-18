package IfElseStatements;

import java.util.Scanner;

//Scrivi un programma che calcoli la lunghezza di una stringa,
// sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
// "Lunghezza minore di 10" o "Lunghezza pari a 10".
public class IfElseStatements2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola o una frase: ");
        String parola = scanner.nextLine();

        if (lunghezzaStringa(parola) > 10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (lunghezzaStringa(parola) < 10) {
            System.out.println("Lunghezza minore di 10");
        } else if (lunghezzaStringa(parola) == 10) {
            System.out.println("Lunghezza pari a 10");
        }
    }

    public static int lunghezzaStringa (String parola) {
        return parola.length();
    }

}
