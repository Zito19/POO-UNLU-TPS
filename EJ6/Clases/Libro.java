package TP1.EJ6.Clases;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anio;
    private int paginas;
    private int ejemplares;
    private int ejemplaresPrestados = 0;

    // Construct
    protected Libro(String titulo, String autor, int anio, String isbn, int paginas, int ejemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.isbn = isbn;
        this.paginas = paginas;
        this.ejemplares = ejemplares;
    }
    protected void descripcion(){
        System.out.println("Libro " + titulo + ". Autor " +
                autor + "\nPaginas " + paginas + "\nquedan " +
                ejemplares + " disponibles y se prestaron " + ejemplaresPrestados + " ejemplares.\n");
    }
    protected void prestarLibro(){
        //si solo queda un ejemplar disponible NO SE PUEDE PRESTAR
        if(ejemplares > 1){
            ejemplaresPrestados++;
            ejemplares--;
        }
        else {System.out.println("NO SE PUEDE PRESTAR");}
    }
    protected boolean devolverLibro(){
        if (ejemplaresPrestados > 0){
            ejemplaresPrestados--;
            ejemplares++;
            return true;
        }
        return false;
    }
    //SETTERS GETTERS
    protected  void setTitulo(String titulo){this.titulo = titulo;}
    protected String getTitulo(){return titulo;}
    protected  void setEjemplares(int ejemplares){this.ejemplares = ejemplares;}
    protected int getEjemplares(){return ejemplares;}
    protected  void setEjemplaresPrestados(int ejemploresPrestados){this.ejemplaresPrestados = ejemplares;}
    protected int getEjemplaresPrestados(){return ejemplaresPrestados;}


}
