public class Estacionamento {

    private String nome;
    private String cnpj;

    private Endereco endereco;

    public Estacionamento(String nome, String cnpj, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public void imprimirDados() {
        System.out.println("Estacionamento: " + nome);
        System.out.println("CNPJ: " + cnpj);
        endereco.imprimirDados();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
