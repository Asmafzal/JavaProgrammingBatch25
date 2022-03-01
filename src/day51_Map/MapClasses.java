package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key     value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Ahmet"); //the last one will be kept...the one before will be deleted...key has to be unique
        //hashMap is fastest of the maps...the performance, less memory, thats why its used more ..but the order is not guaranteed
        
        System.out.println("hashMap = " + hashMap);
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");
        //the insertion order of the linkedhashmap is preserved

        Map<Integer, String> map3 = new TreeMap<>();

        Map<Integer, String> map4 = new Hashtable<>();



    }
}
