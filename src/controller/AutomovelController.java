package controller;

import model.Automovel;

public class AutomovelController {
    public static void main(String[] args) {
        //Nós começamos fazendo o básico, imprimindo o famoso "Hello World "
        System.out.println("Hello World " + 5);

        //Depois evoluímos criando variáveis do Tipo Primitivo

        //Tipos primitivos (Tipos básicos)
        //Tipo + nomeDaVariável = valor (literal)
        //inteiro
        int inteiro = 1_000_000;
        //número com ponto flutuante (ou vírgula flutuante para nós brasileiros)
        double numeroComVirgula = 15.0;

        //caractere
        char caractere = 'a';

        //booleano
        boolean boleano = true;

        //imprimindo os Tipos Primitivos
        System.out.println("Os Tipos Primitivos");
        System.out.println("Um número inteiro (int): " + inteiro);
        System.out.println("Um número com vírgula (double): " + numeroComVirgula);
        System.out.println("Um char: " + caractere);
        System.out.println("Um boolean: " + boleano);

        System.out.println(); //só para dar um espaço entre uma saída e outra no console

        //E, por fim, fizemos um contraste entre Tipos Primitivos e Tipos do Programador (tipos definidos em classes no pacote model)

        Automovel automovel1 = new Automovel();
        //automovel1.setMarca("Fiat"); //isso ficou aqui para você lembrar que ao encapsular um atributo o acesso para as operações de leitura e escrita é bloqueado para esta classe
        //automovel1.modelo = "Fiat"; //isso ficou aqui para você lembrar que ao encapsular um atributo o acesso para as operações de leitura e escrita é bloqueado para esta classe

        //imprime o Automovel
        System.out.println("Um Tipo do Programador (definido na classe Automovel");
        System.out.println(automovel1);

        System.out.println(); //só para dar um espaço entre uma saída e outra no console

        //cria e imprime outro Automovel
        Automovel automovel2 = new Automovel("Volks", "Fox", 2012);
        System.out.println("Outro Tipo do Programador (definido em uma classe Automovel");
        System.out.println(automovel2);

    }
}
