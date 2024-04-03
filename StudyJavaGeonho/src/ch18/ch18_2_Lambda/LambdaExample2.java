package ch18.ch18_2_Lambda;

import java.util.ArrayList;
import java.util.List;

interface Condition {
    String test(String str);
}
public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("grape");
        strings.add("orange");
        strings.add("kiwi");
    }
}
