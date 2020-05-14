public class CasosPrueba {




    public boolean esPalindromo(String palabra){
        String palabraAux = "";
        for (int i = palabra.length()-1; i>=0; i--){
            char caracter = palabra.charAt(i);
            palabraAux += caracter;
        }
        return palabra.equals(palabraAux);
    }


    public int randomEntre(int min, int max){
        return min + (int)(Math.random() * ((max-min)+1));
    }

}
