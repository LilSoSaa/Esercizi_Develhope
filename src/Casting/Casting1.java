package Casting;
//Scrivere uno snippet di codice che dati 2 numeri con
// la virgola (double) li sommi e li stampi senza virgola (int).
public class Casting1 {
    public static void main(String[] args) {
        double num1 = 3.15;
        double num2 = 9.43;

        int somma = (int) (num1 + num2);

        System.out.println(somma);
    }
}
