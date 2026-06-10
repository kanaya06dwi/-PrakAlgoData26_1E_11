package P14;
import java.util.ArrayList;
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<customer> customers = new ArrayList<>(2);
        customer customer1 = new customer(1, "Kanaya");
        customer customer2 = new customer(5, "Dwi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new customer(4, "Yunia"));
        customers.add(new customer(50, "Fizi"));

        System.out.println(customers.indexOf(customer2));

        customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Dwi Putra";

        for (customer cust : customers) {
            System.out.println (cust.toString());
        }
        ArrayList<customer> newCustomers = new ArrayList<>();
        newCustomers.add(new customer(201, "ALi"));
        newCustomers.add(new customer(202, "Badar"));
        newCustomers.add(new customer(203, "Candra"));

        customers.addAll(newCustomers);

        for (customer cust : customers) {
            System.out.println (cust.toString());
        }
        System.out.println(customers);
}
}