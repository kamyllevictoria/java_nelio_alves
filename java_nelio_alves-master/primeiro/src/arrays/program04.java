package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class program04 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Lucas");
        list.add("Marcos");
        list.add("Ana");
        list.add(1, "Victoria");

        list.remove(1);

        System.out.println(list.size());
        for(String x:list) {
            System.out.println(x);
        }

        list.removeIf(x-> x.charAt(0) == 'M');

        System.out.println("After lambda funcion: ");
        for(String x:list) {
            System.out.println(x);
        }

        System.out.println("------------");
        System.out.println("Index of Lucas: " + list.indexOf("Lucas"));
        System.out.println("Index of Bob: " + list.indexOf("Bob"));


        System.out.println("------------");
        List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').toList();
        System.out.println(result);


        System.out.println("------------");
        String name = list.stream().filter(x-> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);

    }
}

