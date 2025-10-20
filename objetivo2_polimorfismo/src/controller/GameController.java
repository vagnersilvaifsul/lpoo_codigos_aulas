package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {
        //Polimorfismo por sobrecarga nas classes
        Personagem a1 = new Aviao();
        Personagem a2 = new Aviao(5.0,5.0);

        Personagem n1 = new Navio();
        Personagem n2 = new Navio(7.0,7.0);

        Personagem t1 = new Tanque();
        Personagem t2 = new Tanque(8.0, 8.0);

        Personagem s1 = new Submarino(9.0, 9.0);
        Personagem s2 = new Submarino(9.0, 9.0);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(a1);
        personagens.add(a2);
        personagens.add(n1);
        personagens.add(n2);
        personagens.add(t1);
        personagens.add(t2);
        personagens.add(s1);
        personagens.add(s2);

        for (Personagem personagem : personagens){
            personagem.desenhar();
            personagem.mover(15.0, 15.0);

            if(personagem instanceof Aviao){
                ((Aviao) personagem).mover3D(10.0, 10.0, 10.0);
            }
            System.out.println(personagem);
        }

    }
}
