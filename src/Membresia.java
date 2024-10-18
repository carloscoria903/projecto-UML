import java.time.LocalDate;

public class Membresia extends Usuario{

    private TipoMenbresia tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Membresia(String nombre, String email, String clave, TipoMenbresia tipo, LocalDate fechaInicio, LocalDate fechaFin) {
        super(nombre, email, clave);
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public TipoMenbresia getTipo() {
        return tipo;
    }

    public void setTipo(TipoMenbresia tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void cancelar(){
        System.out.println("cancelaste putin..");
    }

    public void renovar(){
        System.out.println("vienvenido otra ves putin.. no mires tanto nopor..");
    }










}
