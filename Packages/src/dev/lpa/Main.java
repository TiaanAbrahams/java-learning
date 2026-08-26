package dev.lpa;

import com.abc.first.Item;

public class Main {
    public static void main(String[] args) {
        Item computer = new Item("Computer");
        String itemString = computer.toString();

        System.out.print(itemString);
    }
}
