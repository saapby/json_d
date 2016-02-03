import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by saap.net on 03.02.2016.
 */
public class TestJsonD {

    public JsonObject returnJson(String path) {
        JsonObject jsonObject = null;
        try (FileReader input = new FileReader(path);
             JsonReader jsonReader = Json.createReader(input)) {
            jsonObject = jsonReader.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
