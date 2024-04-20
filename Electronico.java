public abstract class Electronico {

    public String name;
    public String modelo;
    public String descripcion;
    public double precio;
    public int id;
    
    public Electronico(int id, String name, String modelo, String descripcion, double precio) {
        this.id = id;
        this.name = name;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}