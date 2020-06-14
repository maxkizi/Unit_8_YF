package Nemchinski.HomeWork;

import java.util.*;


public class TestSet   {


    public static void main(String[] args) {
        List<Integer> s1 = new ArrayList<>();

        Integer num1 = 1;
        Integer num2 = 5;
        Integer num3 = -24;
        Integer num4 = 0;
        Integer num5 = 23;


        s1.add(num1);
        s1.add(num2);
        s1.add(num3);
        s1.add(num4);
        s1.add(num5);

        for (Integer i: s1)
        System.out.println(i);
    }
}
