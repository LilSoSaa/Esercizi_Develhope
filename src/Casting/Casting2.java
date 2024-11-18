package Casting;
//Dati due caratteri, restituire la somma dei loro valori ASCII
public class Casting2 {
    public static void main(String[] args) {
        char a = 't';
        char b = 'f';

        int somma = a + b;

        System.out.println("Valore ASCII di 'a': " + (int) a);
        System.out.println("Valore ASCII di 'b': " + (int) b);
        System.out.println(somma);
    }
}
