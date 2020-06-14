package YF;

import java.util.ArrayList;

public class TestCustomer {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer  cust1 = new Customer("Kizilov", "Maxim");
        Customer cust2 = new Customer("Telegina" , "Milena");

        customers.add(cust1);
        customers.add(cust2);

        for (Customer c: customers){
            System.out.println(c.first_name + c.last_name);
        }

    }
}
