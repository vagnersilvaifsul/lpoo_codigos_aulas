package model;

public class ContaCorrente extends Conta{
    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
        //super.saldo = saldo;
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo = this.saldo + (this.saldo * (taxa/100)) * 0.05;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
