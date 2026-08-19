package desafioinicial;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioInicial {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        List<String> cartasBaralhos = Arrays.asList("1", "9", "3", "5", "2");

        cartasBaralhos.stream().sorted().forEach(print);

    }

}
