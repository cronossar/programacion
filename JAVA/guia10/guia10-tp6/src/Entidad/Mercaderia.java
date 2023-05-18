
package Entidad;

public class Mercaderia {
    
    private String productos;
    private Double precio;

    public Mercaderia() {
    }

    public Mercaderia(String producto, Double precio) {
        this.productos = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return productos;
    }

    public void setProducto(String producto) {
        this.productos = productos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mercaderia{" + "productos=" + productos + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
