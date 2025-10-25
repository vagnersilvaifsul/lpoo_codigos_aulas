package model;

public class Passaro extends Animal{
    private double z;

    public Passaro() {
    }

    public Passaro(double x, double y) {
        super(x, y);
    }

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhar um passaro");
    }

    @Override
    public String toString() {
        return "\nPassaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
