import java.util.ArrayList;

public class Foreach_Array {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("hamster");
        animals.add("mouse");
        for(String i: animals)
        {
            System.out.println(i);
        }
    }
}
