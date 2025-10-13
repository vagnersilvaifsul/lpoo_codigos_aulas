package model;

public class GerenteGeral extends Gerente{
    public GerenteGeral() {
    }

    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return super.salario * 0.40;
    }

    @Override
    public String toString() {
        return "\nGerenteGeral{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
