package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsJava {
    public static void main(String[] args) {
        List<String> listGenerics = new ArrayList<>();
        listGenerics.add("Element 1");
        listGenerics.add("Element 2");

        for (String element : listGenerics) {
            System.out.println(element);
        }
    }
}
