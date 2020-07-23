package anton_saburov;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {
    public static void main(String[] args) {
        //1.
        Set set = new TreeSet();
        for (int i = 0; i < 10; i++){
            set.add(new MyClass(" " + i));
        }
        for (Object o: set){
            System.out.println(o);
        }
        //2.
        Map map = new HashMap();
        for (int i = 0; i <10; i ++){
            map.put(i, "Name:" + i);
        }
        Object f = map.get(1);

    }
}

class MyClass implements Comparable {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        MyClass mc = (MyClass)o;
        return this.name.compareTo(mc.name);
    }
}
