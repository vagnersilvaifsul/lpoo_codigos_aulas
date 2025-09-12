package model;

public class Automovel {
    //Atributos
    private String marca;
    private String modelo;
    private int anoFabricacao;

    //Métodos Construtores
    public Automovel() {
    }

    public Automovel(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //Métodos Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Método conversor de Object para String (este método está escrito na classe Object)
    @Override
    public String toString() {
        return "Automovel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
