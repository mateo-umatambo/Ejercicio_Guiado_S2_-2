//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Producto d1 = new Producto();

    d1.setNombre("Laptop");
    d1.setPrecio(12);
    d1.setCategoria("Tecnologia");

    System.out.println(d1.getNombre());
    System.out.println(d1.getPrecio());
    System.out.println(d1.getCategoria());
}
