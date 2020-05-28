
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Utilidad {


    public int parseInt(String textNumber){
        try {
            int resultado = Integer.parseInt(textNumber);
            return resultado;
        }catch (NumberFormatException e){
            System.out.println("Intente ingresando un número");
            System.out.println(e.getMessage());
        }
        return -1;
    }


    public boolean validarFormatoFecha(String fecha){

        boolean resultado = false;

        try {
            resultado = Pattern.matches("\\d{4}-\\d{1,2}-\\d{1,2}", fecha);
        }catch (NullPointerException e){
            System.out.println("Ingrese un valor no nulo");
        }
        return resultado;

    }


    public void crearNuevaFecha(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        if (validarFormatoFecha(fecha)){
            Date date = sdf.parse(fecha);
            System.out.println(date);
        }else{
            System.out.println("Formato de fecha no válido");
        }
    }


    public String obtenerDatoArray(String array[], int index){

        try{
            return array[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El índice se encuentra fuera del arreglo");
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

        return "";

    }

}
