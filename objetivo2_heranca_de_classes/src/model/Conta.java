package model;

public abstract class Conta {
    //atributos
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public abstract void atualiza(double taxa);

    public double getSaldo() {
        return saldo;
    }
}
