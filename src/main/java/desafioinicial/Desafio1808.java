package desafioinicial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio1808 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Álgebra booleana AND, OR e NOT
        // && = AND, || = OU, ! = NOT
        System.out.println("Responda com TRUE ou FALSE");
        System.out.println("Veio na faculdade hoje? ");
        boolean teste1 = sc.nextBoolean();
        System.out.println("Estudou legal? ");
        boolean teste2 = sc.nextBoolean();
        if (teste1 && teste2) {
            System.out.println("Aula rendeu!");
        } else if (teste1 && !teste2) {
            System.out.println("Aula não rendeu tanto!");
        } else if (!teste1 && !teste2) {
            System.out.println("Melhore mais amanhã!");
        } else if (teste1 || teste2) {
            System.out.println("Talvez a aula tenha rendido hoje!");
        }

        // 2. Conjuntos
        List<Integer> numerosA = List.of(1, 2, 3, 4);
        List<Integer> numerosB = List.of(3, 4, 5, 6);

        List<Integer> juncaoListas = new ArrayList<>(numerosA);
        juncaoListas.addAll(numerosB);
        System.out.println("Listas unidas " + juncaoListas);

        List<Integer> remocaoListas = numerosA.stream()
                .filter(numerosB::contains)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Números removidos: " + remocaoListas);

        List<Integer> subtracaoListas = Stream.concat(
                        numerosA.stream().filter(numero -> !numerosB.contains(numero)),
                        numerosB.stream().filter(numero -> !numerosA.contains(numero)))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Subtração das listas: " + subtracaoListas);

        // 3. Algoritmo
        System.out.println("Informe a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota 2: ");
        double nota2 = sc.nextDouble();

        double mediaNotas = (nota1 + nota2) / 2;
        if (mediaNotas >= 6) {
            System.out.println("Aluno aprovado!\nMédia = " + mediaNotas);
        } else {
            System.out.println("Aluno reprovado!\nMédia = " + mediaNotas);
        }

    }

}
