package interfaces;

public class TestaFuncionario {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Robson", 42);

        System.out.println("Atributos de um Gerente: ");
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
        vendedor1.fecharLoja();
    }
}
