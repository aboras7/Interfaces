package interfaces;

public class Gerente extends Funcionario implements AuxiliarDeLoja {
    public Gerente(String nome, int idade) {
        super(nome, idade);
    }


    public Gerente () {

    }

    @Override
    public void organizarCabides() {
        System.out.println("Verificar se os cabides estão bem organizados pelo auxiliar de loja ou vendedor.");
    }

    @Override
    public void vender() {
        System.out.println("Auxiliar os vendedores nos atendimentos, quando necessário.");
    }

    @Override
    public void abrirLoja() {
        System.out.println("Abrir loja com a chave.");
    }

    @Override
    public void trabalhar() {
        super.trabalhar();
    }

    @Override
    public void almocar() {
        System.out.println("Ao Mossar no Outback");
    }

    @Override
    public void fecharLoja() {
        super.fecharLoja();
    }
}

