package CicliAvanzati;

import java.util.Scanner;

//Scrivi un programma che contenga un metodo che prende in
// ingresso un valore numerico e stampa tutti i numeri fino
// al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
public class CicliAvanzati1 {
    public static void main(String[] args) {
        valoreImmesso();
    }

    public static void valoreImmesso () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero a piacere: ");
        int valore = scanner.nextInt();

        for (int i = 0; i <= valore; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Interruzione del for perchè valore uguale a 5");
                break;
            }
        }

        scanner.close();

    }

}
