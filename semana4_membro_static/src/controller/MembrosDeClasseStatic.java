package controller;

public class MembrosDeClasseStatic {

    private static String nome;

    public static void main(String[] args) {
        MembrosDeClasseStatic obj = new MembrosDeClasseStatic();
        MembrosDeClasseStatic.nome = "Ana";
        System.out.println(MembrosDeClasseStatic.nome);

        MembrosDeClasseStatic.multiplicar(5, 5);
    }

    private static double multiplicar(double a, double b){
        return a * b;
    }
}
