package controller;

import model.Funcionario;

public class EqualsEHashCode {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", 1_000.0);

        Funcionario f2 = new Funcionario("Ana", 500.0);

        if(f1.equals(f2)){
            System.out.println("São iguais");
            System.out.println(f1.hashCode());
            System.out.println(f2.hashCode());
        } else {
            System.out.println("Sõ DIFERENTES");
            System.out.println(f1.hashCode());
            System.out.println(f2.hashCode());
        }
    }
}
