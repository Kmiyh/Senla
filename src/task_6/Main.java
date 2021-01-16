package task_6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("A", 10, 1600));
        items.add(new Item("B", 20, 5000));
        items.add(new Item("C", 13, 1500));
        items.add(new Item("D", 17, 40000));
        items.add(new Item("E", 11, 2000));

        Backpack backpack = new Backpack(50);
        backpack.makeAllSets(items);
//        System.out.println(items);
        System.out.println("Предметы в рюкзаке:");
        System.out.println(backpack.getBestItems());
    }

}
