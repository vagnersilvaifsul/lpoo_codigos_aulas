package controller;

import model.Dependente;
import model.Socio;

public class SocioDependenteController {

    public static void main(String[] args) {
        Socio socio1 = new Socio("Ana");
        Dependente dependente1 = new Dependente();
        dependente1.setNome("Joãozinho");
        dependente1.setSocio(socio1);
        Dependente dependente2 = new Dependente();
        dependente2.setNome("Mariazinha");
        dependente2.setSocio(socio1);

        socio1.getDependentes().add(dependente1);
        socio1.getDependentes().add(dependente2);

        System.out.println(socio1);

        System.out.println(dependente1);

    }
}
