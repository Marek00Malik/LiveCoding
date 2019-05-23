package pl.code.house.recruiting.java;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Collections_Sets {

    public static void main(String...args) {
        Set<Item> itemSet = new TreeSet<>();

        IntStream.range(0, 10).forEach((i) -> itemSet.add(new Item("Value")));

//        System.out.println(itemSet);
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
