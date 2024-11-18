package SwitchStatement;

import java.util.Scanner;

//Scrivi un programma che contenga un metodo che prende in ingresso
// un carattere e ne identifica il tipo per un operazione di algebra
// (+ addizione - sottrazione * moltiplicazione / divisione).
//Nel caso non riesca ad identificare il tipo di operazione dovrà
// restituire una stringa di errore
public class SwitchStatement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Inserisci il primo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Inserisci un'operazione (+, -, *, /): ");
        char operazione = scanner.next().charAt(0);

        System.out.println(calcolaOperazione(numero1, numero2, operazione));

        scanner.close();
    }

    public static String calcolaOperazione(double num1, double num2, char operazione) {
        switch (operazione) {
            case '+':
                return "Risultato: " + (num1 + num2);
            case '-':
                return "Risultato: " + (num1 - num2);
            case '*':
                return "Risultato: " + (num1 * num2);
            case '/':
                if (num2 != 0) {
                    return "Risultato: " + (num1 / num2);
                } else {
                    return "Errore: divisione per zero non consentita";
                }
            default:
                return "Errore: operazione non riconosciuta";
        }
    }
}
