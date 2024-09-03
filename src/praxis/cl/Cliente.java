package praxis.cl;

public class Cliente extends Persona {


    public Cliente(String rut, String nombre, int edad){
        super(rut,nombre, edad);

    }

    @Override
    public String toString() {
        return "Cliente{" + "}" + super.toString();
    }
}


