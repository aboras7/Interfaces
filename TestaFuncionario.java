package interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário ");
        String nomeFun = leia.nextLine();

        System.out.println("Digite a idade: ");
        int idadeFun = Integer.parseInt(leia.nextLine());

        Gerente gerente1 = new Gerente(nomeFun, idadeFun);

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
        vendedor1.fecharLoja();
    }
}

