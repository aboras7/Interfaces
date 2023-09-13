package interfaces;

public class Vendedor extends Funcionario implements AuxiliarDeLoja {
    public Vendedor(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public void organizarCabides() {
        System.out.println("Organizar os cabides após as vendas.");
    }

    @Override
    public void vender() {
        System.out.println("Abordar os clientes ativamente e vender");
    }

    @Override
    public void abrirLoja() {
        System.out.println("Abrir a loja quando o chefe chega mais tarde.");
    }

    @Override
    public void almocar() {
        super.almocar();
    }
}
