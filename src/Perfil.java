import java.util.ArrayList;

public class Perfil extends Usuario{

    private String nombrePerfil;
    private int edad;
    private ArrayList<String> contenidoVisto  = new ArrayList<String>();
    private ArrayList<String> Preferencias  = new ArrayList<String>();

    public Perfil(String nombre, String email, String clave, String nombre1, int edad, ArrayList<String> preferencias, ArrayList<String> contenidoVisto) {
        super(nombre, email, clave);
        this.nombrePerfil = nombre1;
        this.edad = edad;
        Preferencias = preferencias;
        this.contenidoVisto = contenidoVisto;
    }


    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombre) {
        this.nombrePerfil = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getContenidoVisto() {
        return contenidoVisto;
    }

    public void setContenidoVisto(ArrayList<String> contenidoVisto) {
        this.contenidoVisto = contenidoVisto;
    }

    public ArrayList<String> getPreferencias() {
        return Preferencias;
    }

    public void setPreferencias(ArrayList<String> preferencias) {
        Preferencias = preferencias;
    }

    //public void verContenido(contenido){

   // }

    //public void personalizarPerfil(ArrayList<String>) {

    //}


}



