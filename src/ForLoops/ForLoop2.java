package ForLoops;
//Scrivi un programma che contenga un metodo che prende in ingresso
// un numero e il massimo numero di risultati che vuoi avere e stampi
// tutti i numeri naturali in ordine inverso (quindi se passo il punto
// di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in
// uscita [6 5 4] stampati).
public class ForLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero che desideri: ");
        int numero = scanner.nextInt();

        System.out.println("Inserisci quanti risultati desideri: ");
        int numeroRisultati = scanner.nextInt();

        restituisciNumeriN(numero, numeroRisultati);


    }

    public static void restituisciNumeriN (int numero, int risultatiDesiderati) {
        System.out.println("I risultati che ci si aspetta sono:  ");
        for (int i = numero; i >= (numero - risultatiDesiderati + 1) && i >= 0; i--) {
            System.out.println(i);
        }
    }

}

  
