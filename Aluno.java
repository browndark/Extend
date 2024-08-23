import Dados.Faculdade;
import Dados.Pessoa;

public class Aluno extends Pessoa{
    private Faculdade faculdade;

    public Aluno(String nome, int documento, String email) {
        super(nome, documento, email);
        this.faculdade = faculdade;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public String toString() {
        return "Aluno{" +
                "faculdade=" + faculdade +
                '}';
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }
}