package anton_saburov.lyambd;

import java.util.ArrayList;
import java.util.List;

public class LyambdaTest {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            persons.add(new Person(100*(i+1), 200*(i+1)));
        }
       /* //1.
        //Вызываем метод calcTotal, в качестве второго параметра задаем инстанс интерфейса Calculating,
        //соттветственно переопределяем метод интерфейса
        calcTotal(persons, new Calculating() {
            @Override
            public double calcTotal(int salary, int bonus) {
                double total = salary+ 0.3 * bonus;
                return total;
            }
        });*/


        //2. Лямбда выражение
        calcTotalLyambda(persons, (s, b) -> s + 0.2 * b  );

        for (Person p : persons){
            System.out.println(p.getTotal());
        }
    }
        //1.
    public static void calcTotal(List <Person> persons, Calculating calc){
        for (Person p: persons){
            p.setTotal(calc.calcTotal(p.getSalary(), p.getBonus()));
        }
    }

        //2.
        public static void calcTotalLyambda(List <Person> persons, Calculating calc){
            for (Person p: persons){
                p.setTotal(calc.calcTotal(p.getSalary(), p.getBonus()));
            }
        }

}



