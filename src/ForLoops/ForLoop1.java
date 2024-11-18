package ForLoops;

import java.util.Scanner;

//Scrivi un programma che contenga un metodo che prende in ingresso
// un valore numerico e restituisca la tabellina aritmetica di quel
// numero che dovrà essere stampata a video.
public class ForLoop1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero che desideri vedere moltiplicato: ");
        int numero = scanner.nextInt();

        System.out.println("Quante volte vuoi vederlo moltiplicato?");
        int numVolte = scanner.nextInt();

        tabellina(numero, numVolte);

    }
    public static void tabellina(int numero, int numeroVolte) {
        for (int i = 0; i <= numeroVolte; i++) {
            int risultatoMoltiplicazione = numero * i;
            System.out.println(numero + " * " + i + " = " + risultatoMoltiplicazione);
        }
    }
}
