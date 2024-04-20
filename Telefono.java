public class Telefono extends Electronico {
    
    public String camara;
    public String tamanio;

    public Telefono(int id, String name, String modelo, String descripcion, double precio, String camara, String tamanio) {
        super(id, name, modelo, descripcion, precio);
        this.camara = camara;
        this.tamanio = tamanio;
    }
    public String getCamara() {
        return camara;
    }
    public void setCamara(String camara) {
        this.camara = camara;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + "\n Name: " + name + "\nmodelo: " + modelo + "\ndescripcion: " + descripcion + "\nprecio: " + precio + "\nCamara: "+ camara + "\nTamanio: " + tamanio;
    }



}
