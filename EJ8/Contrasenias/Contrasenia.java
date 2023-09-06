package TP1.EJ8.Contrasenias;

import java.util.Random;

public class Contrasenia {
    private String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String minus = "abcdefghijklmnopqrstuvwxyz";
    private String num = "0123456789";
    private String caracterEspecial = "<>*&%$##!&=¡!";

    protected String getContrasenia(int longitud) {
        String conjunto = mayus + minus + num + caracterEspecial;

        char[] contrasenia = new char[longitud];
        Random r = new Random();
        for (int i = 0; i < longitud; i++) {
            contrasenia[i] = conjunto.charAt(r.nextInt(conjunto.length()));
        }
        return new String(contrasenia);
    }

}