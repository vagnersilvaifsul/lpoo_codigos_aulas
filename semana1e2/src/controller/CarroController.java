package controller;

import model.Carro;

public class CarroController {
    public static void main(String[] args) {
        System.out.println("CarroController em Ação");

        //Note que o jeito de declarar uma variável não mudou, continua sendo a mesma sintaxe, só muda o tipo
        //Sintaxe: Tipo nomeDaVariavel = new chamadaDeUmMétodoConstrutor
        Carro carro1 = new Carro();

        //imprime o carro
        System.out.println("Carro 1: " + carro1);

        //cria e imprime outro carro
        Carro carro2 = new Carro();
        System.out.println("Carro 2: " + carro2);
    }
}
