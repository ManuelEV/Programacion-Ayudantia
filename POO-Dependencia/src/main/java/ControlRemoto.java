public class ControlRemoto {

    private String color;


    public ControlRemoto(String color) {
        this.color = color;
    }

    public void encenderTelevision(){
        System.out.println("Se encenció la TV");
    }

    public void apagarTelevision(){
        System.out.println("Se apagó la TV");
    }

}
