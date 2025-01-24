package Day17;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100) + 1;

        System.out.println("Random Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}

