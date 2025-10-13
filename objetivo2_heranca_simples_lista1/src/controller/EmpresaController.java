package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class EmpresaController {
    public static void main(String[] args) {
        //a) Interprete o diagrama de classes abaixo na tecnologia Java
        //resolvida no pacote model

        //b) Organize o projeto em camadas MVC;
        //os pacotes model e controller

        //c) Crie, no mínimo, duas instâncias de cada classe deste diagrama (das possíveis) em um
        //controlador específico. Tenha o cuidado de criar estas instâncias de diferentes formas, ou
        //seja, utilize construtores padrão e parametrizado;
        Funcionario g1 = new Gerente();
        Funcionario g2 = new Gerente("Ana", 10_000.00);
        Funcionario d1 = new Desenvolvedor();
        Funcionario d2 = new Desenvolvedor("Rafael", 1_500.00);

        //d) Imprima os objetos que você criou;
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(d1);
        System.out.println(d2);

        //e) Imprima os objetos que você criou;
        //Altere o estado dos objetos criados com o construtor padrão, tenha o cuidado de atribuir
        //valores válidos aos atributos, e imprima-os;
        g1.setNome("Maria");
        g1.setSalario(10_000.00);
        d1.setNome("Pedro");
        d1.setSalario(1_500.00);
        System.out.println(g1);
        System.out.println(d1);

        //Faça o programa retornar o bônus de cada um dos funcionários, seguindo a seguinte regra:
        //para Gerente = 20%, e para Desenvolvedor = 5%. Imprima-os.
        System.out.println(g1.getBonus());
        System.out.println(g2.getBonus());
        System.out.println(d1.getBonus());
        System.out.println(d2.getBonus());

        //g) i) Foi possível criar instâncias da classe Funcionario? Justifique sua resposta.
        //Não é possível, porque a classe está marcada como abstrata
        //ii) Onde você inseriu as regras de negócio solicitadas na questão “f”? Na classe Controller?
        //Na classe Funcionário? Ou nas classes Gerente e Desenvolvedor? Justifique sua
        //resposta.
        //Na classe Gerente e Desenvolvedor, porque elas são concretas

        //2 a) Suponha que os funcionários apresentados no diagrama de classes abaixo fazem parte de
        //uma empresa, então, crie uma coleção de objetos para representar a estrutura de
        //funcionários dessa empresa;
        List<Funcionario> funcionarios = new ArrayList<>();

        //2b. Acrescente na coleção criada no item “a” vinte funcionários, sendo, 2 gerentes e 18 desenvolvedores.
        //cria os gerentes
        //2b. Acrescente na coleção criada no item “a” vinte funcionários, sendo, 2 gerentes e 18 desenvolvedores.
        //cria os gerentes
        //2i
        Gerente ger1 = new GerenteGeral("Ana Júlia", 6500.00);
        //2ii
        Gerente ger2 = new GerenteDesenvolvimento("Rafael", 4500.00);

        //cria mais 18 Desenvolvedores
        //2iii
        Desenvolvedor dev1 = new DesenvolvedorSenior("Beatriz", 3500.00);
        Desenvolvedor dev2 = new DesenvolvedorSenior("Ana", 3500.00);
        Desenvolvedor dev3 = new DesenvolvedorSenior("Elis", 3500.00);
        Desenvolvedor dev4 = new DesenvolvedorSenior("João", 3500.00);
        Desenvolvedor dev5 = new DesenvolvedorSenior("Mario", 3500.00);
        Desenvolvedor dev6 = new DesenvolvedorSenior("José", 3500.00);
        //2iii
        Desenvolvedor dev7 = new DesenvolvedorPleno("Júlia", 2500.00);
        Desenvolvedor dev8 = new DesenvolvedorPleno("Paula", 2500.00);
        Desenvolvedor dev9 = new DesenvolvedorPleno("Rafaela", 2500.00);
        Desenvolvedor dev10 = new DesenvolvedorPleno("Denise", 2500.00);
        Desenvolvedor dev11 = new DesenvolvedorPleno("Carlos", 2500.00);
        Desenvolvedor dev12 = new DesenvolvedorPleno("Tomaz", 2500.00);
        //2iii
        Desenvolvedor dev13 = new DesenvolvedorJunior("Cíntia", 1800.00);
        Desenvolvedor dev14 = new DesenvolvedorJunior("Glória", 1800.00);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Caio", 1800.00);
        Desenvolvedor dev16 = new DesenvolvedorJunior("Roberto", 1800.00);
        Desenvolvedor dev17 = new DesenvolvedorJunior("Clara", 1800.00);
        Desenvolvedor dev18 = new DesenvolvedorJunior("Mel", 1800.00);

        //adiciona os funcionários na coleção (2b)
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(dev7);
        funcionarios.add(dev8);
        funcionarios.add(dev9);
        funcionarios.add(dev10);
        funcionarios.add(dev11);
        funcionarios.add(dev12);
        funcionarios.add(dev13);
        funcionarios.add(dev14);
        funcionarios.add(dev15);
        funcionarios.add(dev16);
        funcionarios.add(dev17);
        funcionarios.add(dev18);
        System.out.print("Funionários cadastrados na empresa\n" + funcionarios);

        //c) Calcule e imprima qual é a folha salarial dessa empresa, COM bônus;
        double folhaSalarialComBonus = 0.0;
        double folhaSalarialSemBonus = 0.0;
        for(Funcionario f : funcionarios){
            folhaSalarialComBonus += f.getSalario() + f.getBonus();
            folhaSalarialSemBonus += f.getSalario();
        }
        System.out.println("\n\nFolha salarial da empresa COM bônus: " + folhaSalarialComBonus);

        //d) Calcule e imprima qual é a folha salarial dessa empresa, SEM bônus;
        System.out.println("\n\nFolha salarial da empresa SEM bônus: " + folhaSalarialSemBonus);

        //e Calcule e imprima o valor do bônus e o salário bruto de cada um dos funcionários dessa
        //empresa;
        for(Funcionario f : funcionarios){
            System.out.println(f.getNome() + " Bonus= " + f.getBonus() + " Salario Bruto= " + (f.getSalario() + f.getBonus()));
        }

        System.out.println("\n\n");
        double novaFolhaComBonus = 0.0;
        for(Funcionario f : funcionarios){
            f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
            novaFolhaComBonus += f.getSalario();
        }
        System.out.println("Nova folha sem Bonus: " + novaFolhaComBonus);


    }
}
