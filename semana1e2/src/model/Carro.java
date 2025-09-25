package model;

public class Carro {
    //atributos
    String marca = "Fiat";
    String modelo = "Uno";


    //Métodos de Acesso aos atributos (ou de construção)
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
