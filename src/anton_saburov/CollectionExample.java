package anton_saburov;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //testList();
        testSet();

    }
    //1.
     public static void testList(){
         List test2 = new LinkedList();
         test2.add("123456");
         test2.add("1234567");
         test2.add("12345678");
         test2.add("12345");

         for (Object s: test2){
             System.out.print(s + " ");
         }
     }

     //2.
    public static void testSet(){
        Set set = new HashSet();

        for (int i = 0; i < 10; i++){
            set.add(" " + i);
        }
        for (Object o: set){
            System.out.println(o);
        }

    }
}
