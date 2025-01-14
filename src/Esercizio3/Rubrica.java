package Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {


    private static HashMap<String, String> listaContatti = new HashMap<String, String>();

    public static void main(String[] args) {

        Add("Mario", "340560543");
        Add("Gabriella", "33456789");
        Add("Eleonora", "32405960");
        Add("Leonardo", "33567890");

        Remove("Mario", "340560543");

        SearchByPhoneNumber("32405960");
        SearchByName("Leonardo");

        Print();

    }

    public static void Add(String Name, String pNumber) {
        listaContatti.put(Name, pNumber);
        System.out.println("Nome: " + Name + " Telefono: " + pNumber);
    }

    public static void Remove(String Name, String pNumber) {
        listaContatti.remove(Name);
        System.out.println("Contatto eliminato con successo!");
    }

    public static void SearchByPhoneNumber(String pNumber) {
        for (String Name : listaContatti.keySet()) {
            if (pNumber.equals(listaContatti.get(Name))) {
                System.out.println("Il contatto con il numero " + pNumber + " è: " + Name);
                break;
            }
        }
        ;

    }

    public static void SearchByName(String Name) {
        System.out.println("Il contatto con il nome: " + Name + " è: " + listaContatti.get(Name));
    }

    public static void Print() {
        for (String Name : listaContatti.keySet()) {
            System.out.println("Nome:" + Name + "Telefono");
        }
        System.out.println(listaContatti);
    }
};
