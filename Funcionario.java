package interfaces;

public abstract class Funcionario {
    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void trabalhar() {
        System.out.println("Começar o dia de trabalho.");
    }

    public void almocar() {
        System.out.println("Hora de Ao Mossar marmita");
    }
    public void fecharLoja() {
        System.out.println("Fechar portão da loja com a chave.\n");
    }
}
