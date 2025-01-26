package Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodReference {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Banana", "apple", "Cherry", "date"));

        Collections.sort(words, String::compareToIgnoreCase);
        words.forEach(System.out::println);
    }
}

