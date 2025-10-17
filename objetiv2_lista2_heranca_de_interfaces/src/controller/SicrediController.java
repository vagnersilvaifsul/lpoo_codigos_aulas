package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SicrediController {
    public static void main(String[] args) {
        //1a) Interprete o diagrama de classes abaixo na tecnologia Java;
        //está no pacote model;

        //1b) Organize o projeto em camadas MVC;
        //Está na estrutura do projeto em camandas, model e controler

        //1c) Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos para
        //os seus atributos. Imprima estes objetos e verifique o resultado;
        Desenvolvedor dev1 = new Desenvolvedor("Elis", 2500.00);
        Desenvolvedor dev2 = new Desenvolvedor("João", 2500.00);
        Desenvolvedor dev3 = new Desenvolvedor("Mario", 2500.00);
        Desenvolvedor dev4 = new Desenvolvedor("José", 2500.00);
        Desenvolvedor dev5 = new Desenvolvedor("Júlia", 2500.00);
        Desenvolvedor dev6 = new Desenvolvedor("Paula", 2500.00);
        System.out.println("*********** Questão 1c ***********");
        System.out.print("\nDesenvolvedores criados: ");
        System.out.print(dev1 + "" +  dev2 + dev3 + dev4 + dev5 + dev6);

        //1c. Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos para os seus atributos. Imprima estes objetos e verifique o resultado;
        Gerente ger1 = new Gerente("Ana", 6500.00, "ALUP11", 500);
        Gerente ger2 = new Gerente("Rafal", 4500.00, "ALUP11", 1000);
        Gerente ger3 = new Gerente("Aline", 4500.00, "ALUP11", 1000);
        Gerente ger4 = new Gerente("Talita", 4500.00, "ALUP11", 1000);
        Gerente ger5 = new Gerente("Paulo", 6500.00, "ALUP11", 1000);
        Gerente ger6 = new Gerente("Cris", 6500.00, "ALUP11", 2000);
        System.out.print("\n\nGerentes criados: ");
        System.out.print(ger1 + "" +  ger2 + ger3 + ger4 + ger5 + ger6);

        //1c. Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos para os seus atributos. Imprima estes objetos e verifique o resultado;
        Cliente cli1 = new Cliente(1, "João", "Dias", "ALUP11", 500);
        Cliente cli2 = new Cliente(2, "Tânia", "Pereira", "ALUP11", 1000);
        Cliente cli3 = new Cliente(3, "Mel", "Soares", "ALUP11", 1000);
        Cliente cli4 = new Cliente(4, "Luna", "Farias", "ALUP11", 1000);
        Cliente cli5 = new Cliente(5, "Maria", "Terra", "ALUP11", 1000);
        Cliente cli6 = new Cliente(6, "Pedro", "Santos", "ALUP11", 2000);

        //1c. Crie seis instâncias de cada classe do diagrama (das possíveis) com valores válidos para os seus atributos. Imprima estes objetos e verifique o resultado;
        System.out.print("\n\nClientes criados: ");
        System.out.print(cli1 + "" +  cli2 + cli3 + cli4 + cli5 + cli6);

        //1d Crie as coleções necessárias para representar os tipos de dados que podem ser
        //manipulados neste sistema;
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Investidor> investidores = new ArrayList<>();

        //Insira os objetos criados no item c nas coleções criadas no item d. Imprima estas coleções;
        //1e. Insira os objetos criados no item c nas coleções criadas no item d. Imprima estas coleções;
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(ger3);
        funcionarios.add(ger4);
        funcionarios.add(ger5);
        funcionarios.add(ger6);
        System.out.print("\n\n*********** Questão 1e ***********");
        System.out.print("\nColeção de Funcionários criada: " + funcionarios);

        //1e. Insira os objetos criados no item c nas coleções criadas no item d. Imprima estas coleções;
        investidores.add(cli1);
        investidores.add(cli2);
        investidores.add(cli3);
        investidores.add(cli4);
        investidores.add(cli5);
        investidores.add(cli6);
        investidores.add(ger1);
        investidores.add(ger2);
        investidores.add(ger3);
        investidores.add(ger4);
        investidores.add(ger5);
        investidores.add(ger6);
        System.out.print("\n\nColeção de investidores criada: " + investidores);

        //1f A partir das coleções criadas no item d liste todos os funcionários cadastrados, ordenandos pelo salário, em ordem decrescente;
        funcionarios
                .sort(Comparator.comparing(Funcionario::getSalario)
                .reversed());
        System.out.print("\nLista de funcionários da empresa ordenados (critério salário, ordem decrescente: " + funcionarios);

        //1g A partir das coleções criadas no item d liste todos os clientes cadastrados, ordenando-os
        //pela quantidade de cotas, em ordem decrescente;
        System.out.print("\nLista de clientes da empresa:");
        investidores
                .sort(Comparator.comparing(Investidor::getQdeCotas)
                .reversed());
        for(Investidor investidor : investidores){
            if(investidor instanceof Cliente){
                System.out.println(investidor);
            }
        }

        //1h) A partir das coleções criadas no item d liste todos os investidores cadastrados, ordenandoos pela quantidade de cotas, em ordem decrescente;
        System.out.print("\n\n*********** Questão 1h ***********");
        investidores
                .sort(Comparator.comparing(Investidor::getQdeCotas)
                .reversed());
        System.out.print("\nLista de investidores da empresa:" + investidores);

        //i) A partir das coleções criadas no item d faça a aplicação imprimir os funcionários com o
        //maior salário;
        System.out.print("\n\n*********** Questão 1i ***********");
        System.out.print("\nFuncionario (s) com maior salário: ");
        Funcionario maiorSalario =
                Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        for(Funcionario f : funcionarios){
            if(f.getSalario() == maiorSalario.getSalario()){
                System.out.println(f);
            }
        }

        //1j A partir das coleções criadas no item d faça a aplicação imprimir os investidores com o
        //maior número de cotas.
        System.out.print("\n\n*********** Questão 1j ***********");
        System.out.print("\nInvestidor (s) com maior número de cotas: ");
        Investidor maiorNumeroDeCotas =
                Collections.max(investidores, Comparator.comparing(Investidor::getQdeCotas));
        for(Investidor i : investidores){
            if(i.getQdeCotas() == maiorNumeroDeCotas.getQdeCotas()){
                System.out.println(i);
            }
        }
    }
}
