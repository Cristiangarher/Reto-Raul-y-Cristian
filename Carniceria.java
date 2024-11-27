public class Carniceria {
    protected int productos;
    protected String nombreProducto;
    protected double precio;
    protected String origen;
    protected double kilos;

    protected Carniceria(int productos, String nombreProducto, double precio, String origen, double kilos) {
        this.productos = productos;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.origen = origen;
        this.kilos = kilos;
    }
    
    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public void mostrarInformacion() {
        System.out.println("Productos: " + productos);
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Origen: " + origen);
        System.out.println("Kilos: " + kilos);
    }


}