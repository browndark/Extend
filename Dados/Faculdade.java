package Dados;

public class Faculdade {
    private String nome;

    public String getNome() {
        return nome;
    }
    private String rua;
    private int fone;

    public String toString() {
        return "Faculdade{" +
                "nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", fone=" + fone +
                '}';
    }



    public Faculdade(String rua, int fone) {
        this.rua = rua;
        this.fone = fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
