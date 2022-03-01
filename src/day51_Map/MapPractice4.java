package day51_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice4 {
    public static void main(String[] args) {
       /* String [] group1 = {"Zuhal", "Sinem", "Asma", "Zorig", "Oleksandr", "Tatiana", "Foziya", "Muzaffer", "Kidane", "Ariuntuul", "Jazmine", "Sabiha"};
        String[]group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};
        String [] group19 = {"Andrii", "Azizozen", "MaryJo", "Mungun", "Neira", "Sultan", "Tahmina", "Yulya", "Munu", "Yunus"};

        */

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Zuhal", "Sinem", "Asma", "Zorig", "Oleksandr", "Tatiana", "Foziya", "Muzaffer", "Kidane", "Ariuntuul", "Jazmine", "Sabiha"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"));
        ArrayList<String> group5= new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"));
        ArrayList<String> group19 = new ArrayList<>(Arrays.asList("Andrii", "Azizozen", "MaryJo", "Mungun", "Neira", "Sultan", "Tahmina", "Yulya", "Munu", "Yunus"));
        //pair : ID & names of students

        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(24, group24);
        groups.put(5, group5);
        groups.put(19, group19);

        System.out.println(groups);
/*
        for (String each : groups.get(9)) {
            System.out.println(each);

 */

        System.out.println(groups.get(2).get(1));
    }

}
