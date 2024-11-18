package OperatoriComparazione;

//Scrivi un programma che contiene un metodo che confronti due numeri interi e determini se sono diversi.
//Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.
public class OperatoriComparazione1 {
    public static void main(String[] args) {

        int a = 12;
        int b = 12;

        boolean result = confrontoDueNumeri(a, b);

        System.out.println("Il primo numero è: " + a);
        System.out.println("Il secondo numero è: " + b);

        System.out.println("I numeri sono diversi?" + result);

    }

    public static boolean confrontoDueNumeri (int a, int b) {
        if (a == b) {
            System.out.println("I numeri sono UGUALI! Devono essere diversi");
        }
        return a != b;
    }

}
