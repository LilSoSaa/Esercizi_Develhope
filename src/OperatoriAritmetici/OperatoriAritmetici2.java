package OperatoriAritmetici;

//Definisci un metodo per la divisione di 2 numeri interi
// che restituisca il risultato che dovrà essere stampato.
public class OperatoriAritmetici2 {
    public static void main(String[] args) {

        int a = 31;
        int b = 7;

        double risultato = divisione(a, b);

        System.out.println("Il risultato della divisione di " + a + " per " + b + " è: " + risultato);
    }

    public static double divisione(int a, int b) {
        if (b == 0) {
            System.out.println("Attenzione!Impossibile dividere per 0");
            return 0;
        }
        return (double) a / b;
    }
}
