package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {
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
    }
}
