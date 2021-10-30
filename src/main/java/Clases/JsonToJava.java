package Clases;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonToJava {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        //File Json = new File("Actores.json");
        try{
            BufferedReader br = new BufferedReader(new FileReader("R:\\TEC - II 2021\\Algoritmos y estructura de datos I\\Asignaciones\\Actividad en clase 2\\-prefijo--laboratorio-star-wars-app\\src\\main\\java\\main\\Actores.json"));
            String Json="";
            String b;
            while ((b=br.readLine())!=null){
                Json+=b;
            }
            br.close();
            Registro actores[] = mapper.readValue(Json, Registro[].class);

            for (Registro itr:actores){
                System.out.println("Nombre: "+itr.getNombre());
                System.out.println("Nacimiento: "+itr.getNacimiento());
                System.out.println("Altura: "+itr.getAltura());
            }
        }catch (FileNotFoundException e){
        }catch (JsonMappingException e) {

        }
        //System.out.println("Nombre: " + edward.getNombre());
            //System.out.println("Correo electrónico: " + edward.getCorreoElectronico());
    }
}
