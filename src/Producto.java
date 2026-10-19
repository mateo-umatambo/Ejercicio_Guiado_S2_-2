public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPrecio(double precio) {
            this.precio = precio;
    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " +nombre); // Muestra los demás atributos
        System.out.println("precio: " +precio); // Muestra los demás atributos
        System.out.println("categoria: " +categoria); // Muestra los demás atributos
    }


}
