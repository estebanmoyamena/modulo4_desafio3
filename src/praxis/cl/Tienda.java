package praxis.cl;
public class Tienda {

    private String nombreT;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private int stock;

     //constructor para return de stock
    public Tienda(String nombteT,int stock){
        this.nombreT=nombteT;
        this.stock=stock;
    }

    public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock, String nombreT) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
        this.nombreT = nombreT;
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String existeStock() {
        return stock > 0 ? "Hay stock disponible: " + stock : "No hay stock disponible";
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombreT='" + nombreT + '\'' +
                ", vendedor=" + vendedor +
                ", vehiculo=" + vehiculo +
                ", stock=" + stock +
                '}';
    }
}
