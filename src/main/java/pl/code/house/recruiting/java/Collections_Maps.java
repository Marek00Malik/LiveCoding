package pl.code.house.recruiting.java;

import java.util.Map;
import java.util.TreeMap;

public class Collections_Maps {

    public static void main(String... args) {
        Map<Integer, Item> itemMap = new TreeMap<>();


        itemMap.put(7, new Item("7"));
        itemMap.put(3, new Item("3"));
        itemMap.put(8, new Item("8"));
        itemMap.put(1, new Item("1"));
        itemMap.put(4, new Item("4"));

        //how to sort the map
        //how to get the value with key 1.
    }

    private static class Item {
        private String value;

        Item(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
