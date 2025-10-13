package model;

public class Gerente extends Funcionario{
    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return super.salario * 0.40;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
