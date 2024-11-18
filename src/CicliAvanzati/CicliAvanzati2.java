package CicliAvanzati;

import java.util.Scanner;

//Scrivi un programma che contenga un metodo che prende in ingresso
// un valore numerico e stampa tutti i numeri fino al valore immesso,
// la stampa dovrà saltare il valore uguale a 5.
public class CicliAvanzati2 {
    public static void main(String[] args) {

        valoreImmesso();
    }

    public static void valoreImmesso () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero a piacere: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i == 5) {
                System.out.println("Saltato il numero 5");
                continue;
            }

            System.out.println(i);
        }

        scanner.close();

    }
}
