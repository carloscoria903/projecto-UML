public class Contenido extends Usuario{

    private  String titulo;
    private String genero;
    private double duracion;

    public Contenido(String nombre, String email, String clave, String genero, double duracion, String titulo) {
        super(nombre, email, clave);
        this.genero = genero;
        this.duracion = duracion;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    //public void Abstract reproducir(){

    //}

    public void mostrarDetalle(){
        System.out.println("detalle mostrado putin..");
    }





}
