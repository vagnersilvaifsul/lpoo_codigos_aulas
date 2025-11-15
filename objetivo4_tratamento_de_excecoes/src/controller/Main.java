package controller;

import exception.MinhaExcecao;

public class Main {

    public static void main(String[] args) {
        double numerador = 10.0;
        double denominador = 0.0;

        metodo2(numerador, denominador);

    }

    private static void metodo2(double numerador, double denominador) {
            dividir(1.0, 0.0);
    }

    private static void dividir(double numerador, double denominador) {

        try {
            throw new MinhaExcecao("Minha mensagem de exception");
        } catch (MinhaExcecao e) {
            throw new RuntimeException(e);
        }

    }
}
