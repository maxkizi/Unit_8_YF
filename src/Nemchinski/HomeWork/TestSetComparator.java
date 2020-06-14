package Nemchinski.HomeWork;

import java.util.Comparator;

public class TestSetComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == o2){
            return 0;
        }
        /*else if (o2 o1){
            return 1;
        }*/
        else return -1;
    }
}
