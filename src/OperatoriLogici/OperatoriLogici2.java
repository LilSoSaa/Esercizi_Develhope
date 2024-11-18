package OperatoriLogici;

import java.util.Scanner;

//Scrivi un programma che permetta di capire, tramite
// l'implementazione di due metodi, se un numero è pari o dispari.
public class OperatoriLogici2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero desiderato:");
        int numero = scanner.nextInt();

        if (numeroPari(numero)) {
            System.out.println("Il Numero inserito che equivale a: " + numero + " è un numero Pari");
        }else {
            System.out.println("Il Numero inserito che equivale a: " + numero + " è un numero Dispari");
        }
    }

    public static boolean numeroPari(int numero) {
        return numero % 2 == 0;
    }

    public static boolean numeroDispari(int numero) {
        return numero % 2 != 0;
    }

}
