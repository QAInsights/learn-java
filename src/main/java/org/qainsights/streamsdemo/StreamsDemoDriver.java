package org.qainsights.streamsdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemoDriver {

    static void main() {
        List<String> s = new ArrayList();
        s.add("Hello");
        s.add("Atlas");
        s.add("ZZZ");

        // Stream is nothing but a operations that can be performed on a Collection
        Stream<String> stream = s.stream().limit(2).sorted();
        List<String> res = stream.collect(Collectors.toList());
        System.out.println(res);


        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(300);

        Stream<Integer> nStream = list.stream()
                .filter((x) -> x > 0)
                .sorted()
                .map((c) -> c + 5)
                .limit(list.size());

        List<Integer> nResult = nStream.collect(Collectors.toList());
        System.out.println(nResult);
        System.out.println("Original List: " + list);

    }


}
