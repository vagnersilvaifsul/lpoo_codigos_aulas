package model;

public class GerenteDesenvolvimento extends Gerente {

    public GerenteDesenvolvimento() {
    }

    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return super.salario * 0.20;
    }

    @Override
    public String toString() {
        return "GerenteDesenvolvimento{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
