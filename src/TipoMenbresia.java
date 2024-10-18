public enum TipoMenbresia {
     Basico(1,500,"lo mas barato"), Premium(2,700,"estas cerca de lo cheto") , Gold(3,1000,"estas cheto");
     private int codigo;
     private double precio;
     private String descripcion;

    TipoMenbresia(int codigo, double precio, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
