package TP1.EJ11.JUEGO;

import java.util.ArrayList;

public class Jugador {
    private int puntajeTotal = 0;

    protected Jugador() {
        this.puntajeTotal = 0;
    }
    protected void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal += puntajeTotal;
    }
    protected int getPuntajeTotal() {
        return this.puntajeTotal;
    }
}
