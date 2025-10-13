package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class SicrediController {

    public static void main(String[] args) {
        //Conta c = new Conta();

        ContaCorrente cc1 = new ContaCorrente(1_000.0);
        ContaPoupanca cp1 = new ContaPoupanca(1_000.0);
        ContaCorrente cc2 = new ContaCorrente(1_000.0);
        ContaPoupanca cp2 = new ContaPoupanca(1_000.0);

        List<Conta> contaList = new ArrayList<>();
        contaList.add(cc1);
        contaList.add(cp1);
        contaList.add(cc2);
        contaList.add(cp2);

        double total = 0;
        for (Conta conta : contaList) {
            total += conta.getSaldo();
        }
        System.out.println("Total de saldo nas contas: " + total);

        for(Conta conta : contaList){
            conta.atualiza(10.0);
        }
        System.out.println(contaList);
    }
}
