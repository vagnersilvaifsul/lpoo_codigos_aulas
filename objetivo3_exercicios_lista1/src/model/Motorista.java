package model;

import java.util.List;

public class Motorista {
    private String nome;
    private String email;
    private String telefone;

    //relação
    private Veiculo veiculo;
    private List<Corrida> corrida;

    public Motorista() {
    }

    public Motorista(String nome, String email, String telefone, Veiculo veiculo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Corrida> getCorrida() {
        return corrida;
    }

    public void setCorrida(List<Corrida> corrida) {
        this.corrida = corrida;
    }

    @Override
    public String toString() {
        return "\nMotorista{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculo=" + veiculo +
                ", corrida=" + corrida +
                '}';
    }
}
