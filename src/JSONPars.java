import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JSONPars {
    FileReader jsonString;
    Object obj;

    public void getYoungGuid()
    {
        try {
            jsonString = new FileReader("resorces/generated.json");
            obj = new JSONParser().parse(jsonString);
        } catch (IOException | ParseException exception) {
            throw new RuntimeException(exception);
        }
        JSONArray jsonArray = (JSONArray) obj;
        Iterator iterator = jsonArray.iterator();

        while (iterator.hasNext()) {
            JSONObject jo = (JSONObject)iterator.next();
            int age =  Integer.parseInt(jo.get("age").toString());
            if(age >= 20 && age <= 30) {
                System.out.println(jo.get("guid"));
            }
        }
    }
}
