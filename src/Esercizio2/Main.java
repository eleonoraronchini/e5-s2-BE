package Esercizio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaInteri = firstList(5);
        System.out.println(listaInteri);

        List<Integer> listaInteri2 = secondList(listaInteri);
        System.out.println(listaInteri2);


    }
    public static List<Integer> firstList (int N){
        List<Integer> listaInteri = new ArrayList<>();
        for (int i =0; i<N; i++){
            Random random = new Random();
            int numRandom = random.nextInt(0,101);
            listaInteri.add(numRandom);
        }
        Collections.sort(listaInteri); //ordina in ordine crescente
        return listaInteri;
    }
    public static List<Integer> secondList (List<Integer> L){
        List<Integer> listaInteri2 = new ArrayList<>(L);
        for (int i = L.size()-1; i>=0; i--){
            listaInteri2.add(L.get(i));
        }
        return listaInteri2;
    }

    public static void thirdList (List<Integer> L3,boolean b3){
        for (int i =0; i<L3.size(); i++){
            if (b3){
            if (i%2==0){
                System.out.println(L3.get(i));
            } else {
                if (i % 2 != 0) {
                    System.out.println(L3.get(i));
                }
            }

        }

    }
    }
}