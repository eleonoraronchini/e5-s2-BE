import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> listaParoleDuplicate = new HashSet<>();
        Set<String> listaParoleDistinte = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero che rappresenti il numero di parole");
        int numeroDiParole = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci " + numeroDiParole + " parole:");
        for (int i = 0; i < numeroDiParole; i++) {
            String parola = scanner.nextLine();
            if (listaParoleDistinte.contains(parola)) {
                listaParoleDuplicate.add(parola);
            } else {listaParoleDistinte.add(parola);
            }
        };

        System.out.println("Le parole duplicate sono: " + listaParoleDuplicate);
        System.out.println("Il numero di parole distinte è: " + numeroDiParole);
        System.out.println("Le parole distinte sono: " + listaParoleDistinte);



    }
    };
