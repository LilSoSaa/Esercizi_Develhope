package OperatoriLogici;

//Scrivi un programma che contiene un metodo che dati 2 interi in ingresso
// ed un valore di confronto verifichi se il numero di confronto è compreso
// tra due valori specifici e stampi il risultato dell'operazione comprensivo
// dei due limiti (inferiore e superiore)
public class OperatoriLogici1 {
    public static void main(String[] args) {

        int numeroInferiore = 9;
        int numeroCompreso = 17;
        int numeroSuperiore = 25;

        boolean compresoTrue = numeroInferiore < numeroCompreso && numeroCompreso < numeroSuperiore;

        System.out.println(compresoTrue);//true

        if (numeroCompreso > numeroInferiore && numeroCompreso < numeroSuperiore) {
            System.out.println("Il numero " + numeroCompreso + " è compreso tra il numero inferiore " + numeroInferiore
                                + " e il numero superiore " + numeroSuperiore);
        }else {
            System.out.println("Il numero che sarebbe dovuto essere compreso tra i due numeri non rispetta la condizione");
        }
    }
}
