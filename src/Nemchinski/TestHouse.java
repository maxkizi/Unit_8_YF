package Nemchinski;

import java.util.*;

public class TestHouse {
    public static void main(String[] args) {
        Set<House> s1 = new HashSet<>();

        House house1 = new House(100, 120000, "Tokyo", true);
        House house2 = new House(40, 70000, "Oxford", true);
        House house3 = new House(70, 180000, "Paris", true);
        s1.add(house1);
        s1.add(house2);
        s1.add(house3);

        for (House h : s1){
            System.out.println(h);
        }

        /*PriceComparator myPriceComparator = new PriceComparator();
        s1.sort(myPriceComparator);

        System.out.println("Sorted: ");
        for (House h : s1){
            System.out.println(h);
        }*/
    }
}
