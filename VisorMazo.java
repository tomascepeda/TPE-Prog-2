package TPE;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class VisorMazo {

    public static void mostrarMazo(String jsonFile) {    	
    	//url = getClass().getResource(jsonFile);
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) { // lee cartas
                String nombreCarta = carta.getString("nombre");
                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                
                Carta c = new Carta(nombreCarta);
                String atributosStr = "";
                for (String nombreAtributo:atributos.keySet()) {
                	
                	atributosStr = atributosStr + nombreAtributo + ": " +
                    atributos.getInt(nombreAtributo) + "; ";     
                	Atributo a = new Atributo(nombreAtributo,atributos.getInt(nombreAtributo));
                	c.addAtributo(a);
                }
                    
                //System.out.println(nombreCarta+"\t\t\t"+atributosStr);
                System.out.println(c);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}