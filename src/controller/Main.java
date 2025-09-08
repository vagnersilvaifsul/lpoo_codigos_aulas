package controller;

import model.Automovel;
import model.Carro;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World " + 5);

        //Tipos primitivos (Tipos básicos)
        //inteiro
        //Tipo + nomeDaVariável = valor (literal)
        int inteiro = 1_000_000;
        double numeroComVirgula = 15.0;

        //caracteres
        char a = 'a';

        //Booleano
        boolean b = true;

        Carro carro1 = new Carro();
        System.out.println("Carro 1: " + carro1);

        Carro carro2 = new Carro();

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();
        System.out.println("Pessoa 1: " + pessoa1);
        System.out.println("Pessoa 2: " + pessoa2);
        System.out.println("Pessoa 3: " + pessoa3);
        System.out.println("Pessoa 4: " + pessoa4);

        Automovel automovel1 = new Automovel();
        //automovel1.setMarca("Fiat");
        //automovel1.modelo = "Fiat";
        System.out.println();
        System.out.println(automovel1);

        Automovel automovel2 = new Automovel("Volks", "Fox", 2012);
        //automovel2.setMarca("Fiat");
        //automovel2.modelo = "Fiat";
        System.out.println();
        System.out.println(automovel2);

    }
}
