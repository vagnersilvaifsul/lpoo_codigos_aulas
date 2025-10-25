package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class GameAnimalController {
    public static void main(String[] args) {
        //1a Interprete o diagrama das classes abaixo na tecnologia Java e organize o projeto em
        //camadas MVC.
        //Os pacotes do projeto e as classes no pacote model

        //1b Crie três instâncias de cada classe do diagrama (das possíveis), com valores válidos para
        //os seus atributos. Insira-os em uma coleção do tipo List e os imprima.
        Peixe pei1 = new Peixe(1.0, 1.0);
        Peixe pei2 = new Peixe(1.0, 1.0);
        Peixe pei3 = new Peixe(1.0, 1.0);
        Cachorro cah1 = new Cachorro(2.0, 2.0);
        Cachorro cah2 = new Cachorro(2.0, 2.0);
        Cachorro cah3 = new Cachorro(2.0, 2.0);
        Passaro pas1 = new Passaro(3.0, 3.0);
        Passaro pas2 = new Passaro(3.0, 3.0);
        Passaro pas3 = new Passaro(3.0, 3.0);
        List<Animal> animais = new ArrayList<>();
        animais.add(pei1);
        animais.add(pei2);
        animais.add(pei3);
        animais.add(cah1);
        animais.add(cah2);
        animais.add(cah3);
        animais.add(pas1);
        animais.add(pas2);
        animais.add(pas3);
        System.out.println("******** Questão 1b ********");
        System.out.print("(Resposta 1b) Lista de animais criada:");
        System.out.println(animais);

        //1c Percorra a coleção e faça com que os personagens sejam posicionados nas coordenadas
        //(2, 2), os desenhe e imprima-os;
        for(Animal animal : animais){
            animal.mover(2.0, 2.0);
            animal.desenhar();
        }
        System.out.println(animais);

        //1d Reposicione os personagens que pertençam a classe Cachorro, nas coordenadas (8, 8), os
        //desenhe e imprima-os;
        for(Animal animal : animais){
            if(animal instanceof Cachorro){
                animal.mover(8.0, 8.0);
                animal.desenhar();
            }
        }

        //1e Reposicione os personagens que pertençam as classes Peixe e Passaro, nas coordenadas
        //(5, 5, 5), os desenhe e imprima-os.
        for(Animal animal : animais){
            if(animal instanceof Peixe){
                ((Peixe) animal).mover3D(5.0, 5.0, 5.0);
                animal.desenhar();
            } else if(animal instanceof Passaro){
                ((Passaro) animal).mover3D(5.0, 5.0, 5.0);
                animal.desenhar();
            }
        }

    }
}
