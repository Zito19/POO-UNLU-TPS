package TP1.EJ8.Contrasenias;

import TP1.clases.ListaEnlazada;

public class AdminContrasenias {
    private int longitud;
    private int letrasMinusculas = 1;
    private int letrasMayuculas = 2;
    private int numeros = 2;
    private Contrasenia contra = new Contrasenia();
    private ListaEnlazada lista = new ListaEnlazada();

    public boolean generarContrasenias(int cantidad, int longitud) {
        if (longitud >= 8 && cantidad >0) {
            for (int i = 0; i <= cantidad; i++) {
                lista.agregar(contra.getContrasenia(longitud));
            }
            return true;
        }
        return false;
    }
    //Muestra todas las contrasenias
    public void mostrarContrasenias() {
        for (int i = 0; i < lista.longitud(); i++) {
            Object elemento = lista.recuperar(i);

            // Verificar si el elemento es una instancia de String
            if (elemento instanceof String) {
                String miString = (String) elemento;

                // Llama al método esFuerte con miString como argumento
                boolean fuerte = esFuerte(miString);

                System.out.print(miString + " - "); // Imprime la contraseña
                System.out.println(fuerte ? "FUERTE" : "DEBIL"); // Imprime si la contraseña es fuerte o no
            }
        }
    }
    //VERIFICA SI UNA CONTRASEÑA ES FUERTE
    public boolean esFuerte(String contrasenia) {
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;

        for (int i = 0; i < contrasenia.length(); i++) {
            char c = contrasenia.charAt(i);
            if (Character.isUpperCase(c)) {
                contadorMayusculas++;
            } else if (Character.isLowerCase(c)) {
                contadorMinusculas++;
            } else if (Character.isDigit(c)) {
                contadorNumeros++;
            }
        }
        return (contadorMayusculas >= letrasMayuculas &&
                contadorMinusculas > letrasMinusculas &&
                contadorNumeros >= numeros);
    }
    //GENERA UNA CONTRASEÑA FUERTE
    public String contraseniaFuerte(int longitud){
        String contrasenia = contra.getContrasenia(longitud);
        while(!esFuerte(contrasenia)){
            contrasenia = contra.getContrasenia(longitud);
        }
        return contrasenia;
    }
    //CORRIGE TODAS LAS CONTRASEÑAS DEBILES
    public void correctorContrasenias(){
        int contador=0;
        for (int i = 0; i < lista.longitud(); i++) {
            Object elemento = lista.recuperar(i);

            // Verificar si el elemento es una instancia de String
            if (elemento instanceof String) {
                String miString = (String) elemento;

                // Llama al método esFuerte con miString como argumento
                boolean fuerte = esFuerte(miString);
                if (fuerte == false){
                    lista.reemplazar(i,contraseniaFuerte(miString.length()));
                    contador ++;
                }
            }
        }
        System.out.println("Se corrigieron "+ contador +" contrasenias");
    }
}

