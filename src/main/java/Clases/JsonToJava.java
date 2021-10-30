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

        BufferedReader br = new BufferedReader(new FileReader("Actores.json"));

        String Json="";

        String b;
        while ((b=br.readLine())!=null){
            Json+=b;
        }
        br.close();


        try {
            Registro actores[] = mapper.readValue(Json, Registro[].class);
        } catch (JsonMappingException e) {

        }
        //System.out.println("Nombre: " + edward.getNombre());
            //System.out.println("Correo electrónico: " + edward.getCorreoElectronico());
    }
}
