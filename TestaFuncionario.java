package interfaces;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Arrays.stream;


public class TestaFuncionario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Gerente gerente1 = new Gerente();
        while (true) {
            System.out.println("\nDigite o nome do cliente: ");
            String nomeFun = leia.nextLine();
            if (nomeFun.isEmpty()) {
                nomeFun = null;
            }
            Optional<String> checaNulo = Optional.ofNullable(nomeFun);
            if (checaNulo.isPresent()) {
                gerente1.setNome(nomeFun);
                break;
            } else {
                System.out.println("Digite um nome válido.");
            }
        }

        System.out.println("Digite a idade: ");
        int idadeFun = Integer.parseInt(leia.nextLine());

        System.out.println("Atributos de um Gerente: ");
        System.out.println(gerente1.getNome() + "," + gerente1.getIdade());
        gerente1.abrirLoja();
        gerente1.vender();
        gerente1.almocar();
        gerente1.organizarCabides();
        gerente1.fecharLoja();

        Vendedor vendedor1 = new Vendedor("Júlio", 33);

        System.out.println("Atributos de um Vendedor: ");
        vendedor1.abrirLoja();
        vendedor1.vender();
        vendedor1.almocar();
        vendedor1.organizarCabides();

        try {
            int valorCaixa;
            System.out.println("Digite o valor final do caixa: ");
            valorCaixa = leia.nextInt();
            System.out.println("Valor final do caixa: " + valorCaixa);

        } catch (InputMismatchException e) {
            System.err.println("\nExceção: " + e);
            System.out.println("Digite um número inteiro: ");
        }

        List<Integer> valoresCaixa = Arrays.asList(700,450,650,900,800,50,580,490,500,100);
        List<Integer> numerosOrdenados = valoresCaixa.stream().sorted().toList();

        System.out.println("\nNúmeros dos caixas anteriores em ordem crescente: " + numerosOrdenados);

        vendedor1.fecharLoja();
    }
}