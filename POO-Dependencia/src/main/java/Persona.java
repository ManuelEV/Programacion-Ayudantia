public class Persona {

    private String nombre;
    private int edad;



    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public void verTV(){
        ControlRemoto control = new ControlRemoto("Negro");
        control.encenderTelevision();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
