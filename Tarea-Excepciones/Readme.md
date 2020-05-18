# Tarea - Excepciones

## Descripción

Esta tarea tiene como objetivo aplicar conceptos de manejo de excepciones y de pruebas unitarias.

Cada estudiante tendrá que probar los métodos de la clase **Utilidad.java** por medio de JUnit, además de identificar las posibles excepciones (en caso de haberlas) de cada método.

El entregable será un archivo PDF que contenga **por cada método**:

- Análisis de las posibles excepciones (y cómo se podría arreglar).
- Evidencia (fotos) de al menos una prueba unitaria.

La entrega será vía mensaje de **Slack** hasta el domingo 24 de mayo a las 23:59, las dudas serán por la misma vía.

## Métodos

```java

//Transforma el primer caracter de una palabra en mayúscula
//Ejemplo, si se ingresa "hola", se transforma en "Hola"
public String upperCaseFirstChar(String word) {
    String upperCase = word.toUpperCase();
    return upperCase.charAt(0) + word.substring(1, word.length() - 1);
}

```


```java
public boolean validarRut(String rut) {

        boolean validacion = false;

        rut = rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

        char dv = rut.charAt(rut.length() - 1);

        int m = 0, s = 1;
        for (; rutAux != 0; rutAux /= 10) {
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) {
            validacion = true;
        }

        return validacion;
    }
```


```java
public Boolean validarEmail (String email) {
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
```
