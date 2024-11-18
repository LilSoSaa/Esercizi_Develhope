package OperatoriAritmetici;

//Definisci un metodo che restituisca il resto della divisione di due numeri
// interi e stampalo a schermo.
public class OperatoriAritmetici1 {
    public static void main(String[] args) {

        int a = 27;
        int b = 8;

        System.out.println("Il resto della divisione di " + a + " per " + b + " è: " + restoDivisione(a, b));
    }

    public static int restoDivisione (int a, int b) {
        return a % b;
    }

}
