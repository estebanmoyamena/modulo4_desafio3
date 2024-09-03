package praxis.cl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {

    private String nombreVenta;
    private String fechaVenta;

    private Cliente cliente;
    private Vehiculo vehiculo;

    public LibroVenta() {
    }

    public LibroVenta(String nombreVenta, String fechaVenta, Cliente cliente, Vehiculo vehiculo) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        File directorio=new File("src","ficheros");

        if(!directorio.exists()){
            if(directorio.mkdirs()) {
                System.out.println("Directorio creado" + directorio.getAbsolutePath());
            }else{
                System.out.println("Error al crear el directorio: " + directorio.getAbsolutePath());
                return;
            }
        }


        File archivo = new File(directorio,getNombreVenta().concat(".txt"));

        if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado");
                } else {
                    System.out.println("Error al crear el archivo");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
                return;

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                bw.write("Numero de venta: " + nombreVenta);
                bw.newLine();
                bw.write("Fecha de venta: " + fechaVenta);
                bw.newLine();

                bw.write("Edad del cliente: " + cliente.getEdad());
                bw.newLine();
                bw.write("Numero de patente: " + vehiculo.getPatente());
                System.out.println("Datos guardados");

            } catch (IOException e) {
                System.out.println("Error al guardar los datos: " + e.getMessage());

            }

        }
    }

        @Override
        public String toString () {
            return "LibroVenta{" +
                    "nombreVenta='" + nombreVenta + '\'' +
                    ", fechaVenta='" + fechaVenta + '\'' +
                    '}';
        }
    }








