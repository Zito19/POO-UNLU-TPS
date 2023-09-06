package TP1.EJ11.JUEGO;

public class Administrador {
    private Palabras palabras = new Palabras();

    private Jugador jugador1 = new Jugador();
    private Jugador jugador2 = new Jugador();

    public boolean agregarPalabrasJugador(String palabra,int jugador) {
        return verificarPalabra(palabra,jugador);
    }

    public boolean verificarPalabra(String palabra,int jugador) {

         if(palabras.palabraValida(palabra) == -1){
             return false;
         }
         if(jugador == 1){
         jugador1.setPuntajeTotal(palabras.palabraValida(palabra));}
         else{jugador2.setPuntajeTotal(palabras.palabraValida(palabra));}
         return true;
    }
    public int getPuntaje(int jugador){
        if(jugador == 1){return jugador1.getPuntajeTotal();
        }
        else return jugador2.getPuntajeTotal();
    }

    public void agregarPalabra(String agregar){
        palabras.agregarPalabras(agregar);
    }
    public void getDiccionario(){
        palabras.mostrarPalabras();
    }
    public void ganador(){
        if(this.getPuntaje(1) > this.getPuntaje(2)){
            System.out.println("EL JUGADOR N1 ES EL GANADOR");
        }
        else if (this.getPuntaje(1) < this.getPuntaje(2)){
            System.out.println("EL JUGADOR N2 ES EL GANADOR");
        }
        else System.out.println("EMPATE");
        System.out.println("PUNTOS TOTALES JUGADOR N1 = "+ getPuntaje(1)+"\n"
                +"PUNTOS TOTALES JUGADOR N2 = "+ getPuntaje(2)+"\n");
    }

}

