public class Series extends Contenido{
    private int numeroTemporadas;

    public Series(String nombre, String email, String clave, String genero, double duracion, String titulo, int numeroTemporadas) {
        super(nombre, email, clave, genero, duracion, titulo);
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void verEpisodio(){

    }
}
