package model;

public class Peixe extends Animal{

    private double z;

    public Peixe() {
    }

    public Peixe(double x, double y) {
        super(x, y);
    }

    public Peixe(double x, double y, double z) {
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
        System.out.println("Desenhou um peixe");
    }

    @Override
    public String toString() {
        return "\nPeixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
