package P14;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
    TreeSet<String> fruits = new TreeSet<>();

    fruits.add("Mangga");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Jambu");
    for (String temp : fruits) {
        System.out.println(temp);
    }
    for (String temp : fruits) {
        System.out.println(temp);
    }

    System.out.println("First: " + fruits.first());
    System.out.println("Last: " + fruits.last());

    fruits.remove("Banana");
    System.out.println("Setelah remove " + fruits);

    fruits.pollFirst();
    System.out.println("Setelah pollFirst " + fruits);

    fruits.pollLast();
    System.out.println("Setelah pollLast " + fruits);
}
}
