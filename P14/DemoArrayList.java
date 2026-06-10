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
        customers.add(new customer(100, "Rizky"));
        customers.add(2, new customer(50, "Fizi"));

        for (customer cust : customers) {
            System.out.println (cust.toString());
        }
}
}