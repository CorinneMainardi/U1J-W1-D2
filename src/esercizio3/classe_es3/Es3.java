package esercizio3.classe_es3;

import java.util.Scanner;

public class Es3 {

    public static String[] es3() {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] splitString = {}; // Valore iniziale per l'array da restituire

        while (true) {
            System.out.println("Inserisci una stringa (digita ':q' per uscire):");
            input = scanner.nextLine(); // Legge l'input dell'utente

            if (input.equals(":q")) {
                System.out.println("Uscita dal programma.");
                break; // Esce dal ciclo
            }

            // Suddivide la stringa in caratteri
            splitString = input.split("");

            // Stampa i caratteri separati da una virgola
            System.out.println("Caratteri separati da virgola: " + String.join(",", splitString));
        }

        scanner.close(); // Chiude lo scanner
        return splitString; // Restituisce l'ultimo array di caratteri
    }
}
