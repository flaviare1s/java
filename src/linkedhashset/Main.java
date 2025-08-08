package linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numerosArrayList = new ArrayList<>();
        numerosArrayList.add(8);
        numerosArrayList.add(5);
        numerosArrayList.add(8);
        System.out.println(numerosArrayList);

        Set<Integer> numerosLinkedHashSet = new LinkedHashSet<>(numerosArrayList);
        System.out.println(numerosLinkedHashSet);

    }
}
