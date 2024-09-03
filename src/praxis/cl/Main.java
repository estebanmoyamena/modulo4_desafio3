package praxis.cl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        //metodo pagarPasaje de la clase taxi


        Taxi taxi1= new Taxi("negro","TT6066",1200);
        taxi1.pagarPasaje(5000);

        // metodo de la clase Bus

        Bus bus1= new Bus("KW0404NT","verde",40);
        bus1.asientosDisponbles();
        System.out.println(bus1.getCantidadDeAsientos());

        //Metodo de la clase MiniBus

        MiniBus miniBus1= new MiniBus("Azul","JD8080KL",20,"Escolar");
        miniBus1.imprimeBus();

        //Metodo de la clase tienda

        Tienda tienda1= new Tienda("La praxis",20);
        System.out.println(tienda1.getStock());


        //atributos que trae  el metodo de la clase librotienda
        Cliente cliente1 = new Cliente("18956789-0","Gabriel Zamora",25);
        Vendedor vendedor= new Vendedor("Samuel","14765567-4",56,"Las Fresas 890");
        Vehiculo vehiculo1= new Vehiculo("Blanco","WE7890OP");
        Vehiculo vehiculo2= new Vehiculo("verde","yu8909yu");
        Cliente cliente2= new Cliente("15897432-1","Nadia",38);

        LibroVenta venta1= new LibroVenta("venta1",  "20/05/2024",cliente1,vehiculo1);
        venta1.guardarVenta(cliente1,vehiculo1);
        LibroVenta venta2= new LibroVenta("venta2",  "27/06/2024",cliente2,vehiculo2);
        venta2.guardarVenta(cliente2,vehiculo2);

    }




}