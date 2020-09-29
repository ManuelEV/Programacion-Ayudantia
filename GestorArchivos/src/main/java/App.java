import com.google.gson.Gson;
import modelo.Persona;

import java.io.*;

public class App {

    //Datos básicos de la ubicación del archivo
    static String directory = System.getProperty("user.dir");
    static String fileName = "archivos\\persona.json";
    static String absolutePath = directory + File.separator + fileName;

    //https://stackabuse.com/reading-and-writing-files-in-java/
    public static void main(String args[]) {

        String personaJson = readFile();

        System.out.println(personaJson);
        Gson gson = new Gson();
        Persona p = gson.fromJson(personaJson, Persona.class);

        System.out.println(p);


        p.setNombre("Pedrito");

        String toJson = gson.toJson(p);

        System.out.println(toJson);

        writeFile(toJson);

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
