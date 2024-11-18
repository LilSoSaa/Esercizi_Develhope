package OperatoriAritmetici;

//Definisci un metodo che calcoli la media tra 3 numeri e restituisca il
// risultato che dovrà essere stampato.
public class OperatoriAritmetici3 {
    public static void main(String[] args) {

        int a = 8;
        int b = 10;
        int c = 23;

        double result = media3Numeri(a, b, c);

        System.out.println("La media tra " + a + ", " + b + " e " + c + " è: " + result);
    }

    public static double media3Numeri (int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

}
