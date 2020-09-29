import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import modelo.Persona;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorListas {

    static String directory = System.getProperty("user.dir");
    static String fileName = "archivos\\personas.json";
    static String absolutePath = directory + File.separator + fileName;

    public static void main(String args[]){

        Gson gson = new Gson();

        ArrayList<Persona> personas = new ArrayList<>();

        Persona p1 = new Persona("Juan", "Perez", 25);
        Persona p2 = new Persona("Pedro", "Gonzalez", 30);
        Persona p3 = new Persona("Diego", "James", 40);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        String toJson = gson.toJson(personas);
        System.out.println(toJson);

        writeFile(toJson);

        String personasJson = readFile();

        System.out.println(personasJson);

        personas.clear();

        personas = gson.fromJson(personasJson, new TypeToken<List<Persona>>(){}.getType());

        System.out.println(personas);

    }


    public static String readFile(){
        String fileContent = "";
        // Read the content from file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {
            String line = bufferedReader.readLine();
            fileContent += line;
            while (line != null) {
                //System.out.println(line);
                line = bufferedReader.readLine();
                if (line != null)
                    fileContent += line;
            }
        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        }
        return fileContent;
    }

    public static void writeFile(String content){
        // Write the content in file
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            // Exception handling
        }
    }



}
