package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {

        /*
            Para aprender sobre coleções o professor reutilizou a resolução do Exercício 1 da Lista 1, do Objetivo 1.
         */


        //i. Crie duas instâncias de cada classe utilizando um construtor padrão;
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        //ii. Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
        //cada classe utilizando um construtor parametrizado por todos os atributos da classe
        //de modelo
        Funcionario f3 = new Funcionario("Ana", 1_000.00);
        Funcionario f4 = new Funcionario("Rafael", 2_000.00);

        Funcionario f5 = new Funcionario("Maria");
        Funcionario f6 = new Funcionario("João");

        //Imprima todos os objetos criados com os construtores, nos itens i, ii e iii,
        //utilizando o método toString();
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);

        //v. Agora utilize os métodos setters de cada classe de modelo para alterar o estado de
        //cada objeto na memória RAM;
        f1.setNome("Fulano");
        f1.setSalario(1_000.00);
        f2.setNome("Beltrano");
        f2.setSalario(1_000.00);

        //Imprima todos objetos novamente, só que agora, ao invés de utilizar o método
        //toString(), utilize os métodos getters.
        System.out.println(f1.getNome() + " " + f1.getSalario());
        System.out.println(f2.getNome() + " " + f2.getSalario());


        /*
                ---------------- Coleções do tipo List e do tipo Map ------------------
         */

        //-------- Coleções do tipo List

        //Como declarar?
        List<Funcionario> funcionarioList = new ArrayList<>();

        //Como popular? (Note que este tipo de coleção permite elementos repetidos)
        funcionarioList.add(f1);
        funcionarioList.add(f2);
        funcionarioList.add(f3);
        funcionarioList.add(f4);
        funcionarioList.add(f5);
        funcionarioList.add(f6);
        funcionarioList.add(f6);
        funcionarioList.add(f6);

        //Como imprimir?
        System.out.println(funcionarioList);

        //Como Pesquisar?
        //Pesquisa por força bruta utilizando for-i (não vamos utilizar)
        System.out.println("Pesquisa por força bruta utilizando for-i");
        for (int i = 0; i < funcionarioList.size(); i++) {
            if(funcionarioList.get(i).getNome().equals("Rafael")){
                System.out.println(funcionarioList.get(i).getNome());
            }
        }
        //Pesquisa por força bruta utilizando forEach (não vamos utilizar)
        System.out.println("Pesquisa por força bruta utilizando forEach");
        for(Funcionario f : funcionarioList){
            if(f.getNome().equals("Rafael")){
                System.out.println(f.getNome());
            }
        }

        //Pesquisa Binária (Vamos dar preferencia por esta técnica) e Ordenação
        //1o. A coleção deve ser ordenada pelo atributo que corresponde à chave de pesquisa (se não ordenar não funciona)
        System.out.println("1o. A coleção deve ser ordenada pelo atributo que corresponde à chave de pesquisa");
        funcionarioList
                .sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(funcionarioList);

        //2o. Aplica a pesquisa binária (Veja que devolve um índice para a posição do elemento na coleção)
        System.out.println("Aplica a pesquisa binária (Veja que devolve um índice para a posição do elemento na coleção)");
        int indice = Collections.binarySearch(
                funcionarioList, //a lista que será pesquisada
                new Funcionario("Maria"), //Objeto a ser pequisado
                Comparator.comparing(Funcionario::getNome)); //Comparador

        //3o. Exibe o resultado da pesquisa binária
        System.out.println("Resultado da Pesquisa Binária (Vamos dar preferencia por esta técnica)");
        System.out.println(funcionarioList.get(indice));

        //-------- Coleções do tipo Map

        //Como declarar
        //List<Funcionario> funcionarioList = new ArrayList<>();
        Map<String, Funcionario> funcionarioMap = new HashMap<>();

        //Como popular
        funcionarioMap.put(f1.getNome(), f1);
        funcionarioMap.put(f2.getNome(), f2);
        funcionarioMap.put(f3.getNome(), f3);
        funcionarioMap.put(f4.getNome(), f4);
        funcionarioMap.put(f5.getNome(), f5);
        //Este tipo de coleção não permite duplicatas. Note que apenas um deles é inserido na coleção
        funcionarioMap.put(f6.getNome(), f6);
        funcionarioMap.put(f6.getNome(), f6);
        funcionarioMap.put(f6.getNome(), f6);

        //Como imprimir
        System.out.println("Imprimindo Map");
        System.out.println(funcionarioMap);

        //Como Pesquisar
        System.out.println("Pesquisando Map");
        System.out.println(funcionarioMap.get(f5.getNome()));

        //Como ordenar (este tipo de coleção não permite ordenação, "quebraria" o uso da Função Hash

    }
}
