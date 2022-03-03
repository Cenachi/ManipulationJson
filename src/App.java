import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        JSONObject objetoJson = new JSONObject();

        objetoJson.put("nome", "Joaquim");
        objetoJson.put("idade", "44");
        objetoJson.put("cpf", "123.456.487-78");

        System.out.println(objetoJson.toJSONString());

        try {
            FileWriter writeFile = new FileWriter("Json.json");
            writeFile.write(objetoJson.toJSONString());
            writeFile.close();
        } catch (Exception e) {
            System.err.println("Erro!");
        }

        JSONObject jsonObject;
        JSONParser parser = new JSONParser();

        Pessoa pessoa = new Pessoa();

        try {
            jsonObject = (JSONObject) parser.parse(new FileReader("Json.json"));

            pessoa.setName((String) jsonObject.get("nome"));
            pessoa.setAge((String) jsonObject.get("idade"));
            pessoa.setCpf((String) jsonObject.get("cpf"));

            System.out.println("Arquivo Json: \n" + pessoa.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
