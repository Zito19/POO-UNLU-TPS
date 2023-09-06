package TP1.EJ7;

public class Raices {
    //ATRIBUTOS
    private double a;
    private double b;
    private double c;
    public Raices(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double discriminante(){
        return Math.sqrt(Math.pow(b, 2) - 4*a*c);
    }
    private void obtenerRaices(){
        double x1 = -b + discriminante()/2*a;
        double x2 = -b - discriminante()/2*a;
        System.out.println("La solucion (x1) es : "+ x1);
        System.out.println("La solucion (x2) es : "+ x2);
    }
    private void obtenerRaiz(){
        double soulucion = -b/2*a;
        System.out.println("La unica solucion es : "+ soulucion);
    }
    private boolean comprobarSiTieneRaices(){
        return discriminante() > 0;
    }
    private boolean comprobarSiTieneRaiz(){
        return discriminante() == 0;
    }

    public void calcular(){
        if(comprobarSiTieneRaices()){
            obtenerRaices();
        }
        else if(comprobarSiTieneRaiz()){
            obtenerRaiz();
        }
        else {
            System.out.println("NO EXISTE SOLUCION");
        }
    }
}

