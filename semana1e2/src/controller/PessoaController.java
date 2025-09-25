package controller;

import model.Pessoa;

public class PessoaController {
    public static void main(String[] args) {
        System.out.println("PessoaController em Ação");

        //Note que o jeito de declarar uma variável não mudou, continua sendo a mesma sintaxe, só muda o tipo
        //Sintaxe: Tipo nomeDaVariavel = new chamadaDeUmMétodoConstrutor
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();


        System.out.println("Pessoa 1: " + pessoa1);
        System.out.println("Pessoa 2: " + pessoa2);
        System.out.println("Pessoa 3: " + pessoa3);
        System.out.println("Pessoa 4: " + pessoa4);
    }
}
