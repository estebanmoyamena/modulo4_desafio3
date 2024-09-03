package praxis.cl;

public class Taxi  extends Vehiculo{
   private int valorPasaje;


    public Taxi( String color, String patente,int valorPasaje){
        super(color,patente);
        this.valorPasaje=valorPasaje;

    }
    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }



    public void pagarPasaje(int pagado){
        if(pagado >= this.valorPasaje) {
            int vuelto = pagado - this.valorPasaje;
            System.out.println("Pasaje pagado , su vuelto es:  " + vuelto);
        }else {
            System.out.println("El valor pagado no corresponde.El valor es " + this.valorPasaje);
        }

    }

    @Override
    public String toString() {
        return "Taxi{" +
                "valorPasaje=" + valorPasaje +
                '}';
    }
}
