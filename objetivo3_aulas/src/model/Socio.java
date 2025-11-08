package model;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    //demais atributos
    String nome;

    //relação binária (bi-direcional) com o Dependente
    List<Dependente> dependentes = new ArrayList<>();

    public Socio() {
    }

    public Socio(String nome) {
        this.nome = nome;
    }

    public Socio(String nome, List<Dependente> dependentes) {
        this.nome = nome;
        this.dependentes = dependentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "\nSocio{" +
                "nome='" + nome + '\'' +

                '}';
    }
}
