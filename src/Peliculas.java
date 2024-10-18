public class Peliculas extends Contenido{
    private String director;

    public Peliculas(String nombre, String email, String clave, String genero, double duracion, String titulo, String director) {
        super(nombre, email, clave, genero, duracion, titulo);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void verTrailer(){
        System.out.println("estas viendo el trailer putitaa... ");
    }

}
