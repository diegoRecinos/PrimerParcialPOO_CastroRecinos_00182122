public class Laptop extends Electronico  {
    

    public String color;
    public String procesador;
    
    public Laptop(int id, String name, String modelo, String descripcion, double precio, String color, String procesador) {
        super(id, name, modelo, descripcion, precio);
        this.color = color;
        this.procesador = procesador;
    }

    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString()
    {
        return "ID: " + id  + "\nName: " + name + "\nmodelo: " + modelo + "\ndescripcion: " + descripcion + "\nprecio: " + precio + "\nColor: "+ color + "\nprocesador: " + procesador;
    }


}
