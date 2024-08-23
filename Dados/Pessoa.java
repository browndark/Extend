package Dados;

public class Pessoa {
    private String nome;
    private int documento;
    private String email;

    public Pessoa(String nome, int documento, String email) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

