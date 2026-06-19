package P15;
import java.util.Iterator;
import java.util.Stack;
public class LoopCollection {
    public static void main(String[] args) {
      Stack<String> fruits = new Stack<>();
      fruits.push("Banana");
        fruits.push("Orange");
        fruits.push("Watermelon");
        fruits.push("Leci");
        fruits.push("Salak");

        for (String fruit : fruits){
            System.out.printf("%s", fruit);
        }
        System.out.println("\n" + fruits.toString());
        while (!fruits.empty()){
            System.out.printf("%s", fruits.pop());
        }
        fruits.push("Melon");
        fruits.push("Durian");
        System.out.print("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s", fruit);
        }
        System.out.print("");
        fruits.stream().forEach(e ->{
             System.out.printf("%s", e);
        });
        System.out.print("");
        for (int i = 0; i < fruits.size(); i++){
            System.out.printf("%s", fruits.get(i));
        }
    }
}
