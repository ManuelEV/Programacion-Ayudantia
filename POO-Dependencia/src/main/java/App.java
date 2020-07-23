public class App {

    public static void main(String args[]){

        Persona p = new Persona("Juanito");

        System.out.println(p.getNombre());

        p.setNombre("Pedrito");

        System.out.println(p.getNombre());

        Persona p2 = new Persona("Stefan", 40);

        System.out.println("Edad: "+p2.getEdad());

        p2.setEdad(41);

        System.out.println("Nueva edad: "+p2.getEdad());

        p2.verTV();

    }

}
