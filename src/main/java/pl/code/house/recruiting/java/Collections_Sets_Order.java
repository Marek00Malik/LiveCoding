package pl.code.house.recruiting.java;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Collections_Sets_Order {

    public static void main(String...args) {
        Set<Item> itemSet = new TreeSet<>();

        IntStream.range(0, 10).forEach((i) -> itemSet.add(new Item("Value")));

        //get First element
    }

    private static class Item implements Comparable<Item>{
        private String value;

        Item(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public int compareTo(Item o) {
            return this.value.compareTo(o.value);
        }
    }
}
