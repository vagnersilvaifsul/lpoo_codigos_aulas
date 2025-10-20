package model;

public class Tanque extends Personagem{

    public Tanque() {
        super();
    }

    public Tanque(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um tanque");
    }

    @Override
    public String toString() {
        return "\nTanque{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
