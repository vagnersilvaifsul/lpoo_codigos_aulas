package model;

public class Dependente {
    //demais atributos
    String nome;

    //relação binária (bi-direcional) com o Socio
    private Socio socio;

    public Dependente() {
    }

    public Dependente(String nome, Socio socio) {
        this.nome = nome;
        this.socio = socio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "nome='" + nome + '\'' +
                ", socio=" + socio +
                '}';
    }
}
