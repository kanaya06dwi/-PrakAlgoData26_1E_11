package P15;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ContohList {
    public static void main(String[] args) {
    ArrayList l = new ArrayList();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add("Cireng");
    System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
        l.get(0), l.size(), l.get(l.size() - 1));
    l.add(4);
    l.remove(0);
    System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
        l.get(0), l.size(), l.get(l.size() - 1));

    List<String> names2 = new LinkedList<>();
    names2.add("Noureen");
    names2.add("Akhleema");
    names2.add("Shannum");
    names2.add("Uwais");
    names2.add("Al-Qarni");

    System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
        names2.get(0), names2.size(), names2.get(names2.size() - 1));
    names2.set(0, "Mykid");
    System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
        names2.get(0), names2.size(), names2.get(names2.size() - 1));
        System.out.println("Names: " + names2.toString());
}
}
