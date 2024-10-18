import java.util.ArrayList;

public class Usuario{

    private String nombre;
    private String email;
    private String clave;
    private ArrayList<Perfil> listaPerfil  = new ArrayList<Perfil>();

    public Usuario(String nombre, String email, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void getListaPerfil() {
        ArrayList<Perfil> listaPerfil1 = listaPerfil;
    }

    public void setListaPerfil(ArrayList<Perfil> listaPerfil) {
        this.listaPerfil = listaPerfil;
    }

    public void iniciaSecion() {
        System.out.println("inicio de secion putin..");
    }

    public void cerrarSecion(){
        System.out.println("secion cerrada puti trolis..");
    }











































}

