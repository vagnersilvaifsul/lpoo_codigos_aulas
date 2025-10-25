package control;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SicrediController {

    public static void main(String[] args) {
        //1a. a. Crie um projeto Java na arquitetura de software MVC;
        //Tá na estrutura de pacotes do projeto, model, controler.

        //1b. Interprete os diagramas de classes apresentados na Figura anexa (página 2);
        //as classes e interfaces criadas no pacote model

        //1c Crie 3 instâncias de cada classe (das possíveis de criar instâncias), insira valores válidos
        //nos atributos dessas instâncias, e imprima esses objetos;
        ContaCorrente cc1 = new ContaCorrente(0.0, 1_000);
        ContaCorrente cc2 = new ContaCorrente(0.0, 1_000);
        ContaCorrente cc3 = new ContaCorrente(0.0, 1_000);
        System.out.println("------- 1c -------");
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        Conta cp1 = new ContaPoupanca(0.0);
        Conta cp2 = new ContaPoupanca(0.0);
        Conta cp3 = new ContaPoupanca(0.0);
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);

        Cliente cl1 = new Cliente("Ana", 1_000);
        Cliente cl2 = new Cliente("Rafael", 1_000);
        Cliente cl3 = new Cliente("Beatriz", 1_000);
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);

        //1d Crie as coleções necessárias para expressar as contas registradas no sistema, bem como, os
        //associados, depois imprima essas coleções;
        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        System.out.println("\n\n------- 1d -------");
        System.out.println(contas);
        List<Associado> associados = new ArrayList<>();
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        associados.add(cl1);
        associados.add(cl2);
        associados.add(cl3);
        System.out.println(associados);

        //1e Movimente, pelo menos, uma conta poupança, realizando as seguintes operações: depósito
        //de R$ 1.000,00; atualização monetária de 5%; saque de R$ 1000,00. Imprima o objeto;
        cp1.deposita(1_000.00);
        cp1.atualiza(5.0);
        cp1.saca(1_000.00);
        System.out.println("\n\n------- 1e -------");
        System.out.println(cp1);

        //1f Movimente, pelo menos, uma conta corrente, realizando as seguintes operações: depósito
        //R$ 1.000,00; atualização monetária de 10%; saque de R$ 1000,00. Imprima o objeto;
        cc1.deposita(1_000.00);
        cc1.atualiza(10.0);
        cc1.saca(1_000.00);
        System.out.println("\n\n------- 1f -------");
        System.out.println(cc1);

        //1g Faça com que cada associado tenha as seguintes quantidades de cotas, nessa ordem: 100,
        //400, 600, 300, 600, 600, e imprima a coleção de associados;
        cc1.setQdeCotas(100);
        cc2.setQdeCotas(400);
        cc3.setQdeCotas(600);
        cl1.setQdeCotas(300);
        cl2.setQdeCotas(600);
        cl3.setQdeCotas(600);
        System.out.println("\n\n------- 1g -------");
        System.out.println(associados);

        //1h A partir das coleções, imprima todos os associados, ordenados pelo critério de número de
        //cotas, em ordem decrescente.
        //E faça o programa calcular e imprimir os associados com o
        //maior número de cotas no sistema
        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println("\n\n------- 1h -------");
        System.out.println(associados);

        System.out.println("\n------- Associados com maior quantidade de cotas -------");
        Associado maiorNumeroDeCotas = Collections.max(
                        associados,
                        Comparator.comparing(Associado::getQdeCotas));
        for(Associado associado : associados){
            if(maiorNumeroDeCotas.getQdeCotas() == associado.getQdeCotas()){
                System.out.println(associado);
            }
        }

        //1i A partir das coleções, imprima todas as contas cadastradas no sistema, ordenadas pelo
        //critério saldo, em ordem decrescente
        //E, imprima todos associados que seja do tipo
        //Associado e possua conta cadastrada no sistema, em qualquer ordem
        //Também faça o programa imprimir a lista de contas com maior saldo bancário
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n\n------- 1i -------");
        System.out.println(contas);

        System.out.println("\n------- Associado e possua conta cadastrada no sistema -------");
        for(Associado associado : associados){
            if(associado instanceof ContaCorrente){
                System.out.println(associado);
            }
        }

        Conta maiorSaldoConta =
                Collections.max(
                        contas,
                        Comparator.comparing(Conta::getSaldo)
                );
        System.out.println("\n------- Contas com maior saldo -------");
        for(Conta conta : contas){
            if(maiorSaldoConta.getSaldo() == conta.getSaldo()){
                System.out.println(conta);
            }
        }

    }
}
