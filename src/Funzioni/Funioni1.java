package Funzioni;

//Definire una funzione che accetti in ingresso 2
// interi e ne restituisca la somma.
public class Funioni1 {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;

        int result = somma(a, b);

        System.out.println("La somma di " + a + " e " + b + " è: " + result);
    }

    public static int somma(int a, int b) {
        return a + b;
    }

}
