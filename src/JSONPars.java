import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONPars {
    private static final String fileName = "resorces/generated.json";
    public Object getJSON() {
        try {
            FileReader jsonString = new FileReader(fileName);
            return new JSONParser().parse(jsonString);
        }
        catch (IOException | ParseException exception) {
            throw new RuntimeException(exception);
        }
    }

    public Iterator arrayJSONIteration(Object obj){
        JSONArray jsonArray = (JSONArray) obj;
        return jsonArray.iterator();
    }

    public List<Person> mapper(Iterator iterator){
        List<Person> people = new ArrayList<>();
        while (iterator.hasNext()) {
            JSONObject jsonObject = (JSONObject)iterator.next();
            Person person = new Person(
                    jsonObject.get("guid").toString(),
                    Boolean.getBoolean(jsonObject.get("isActive").toString()),
                    Double.parseDouble(jsonObject.get("balance").toString().replace("$","").replace(",","")),
                    Integer.parseInt(jsonObject.get("age").toString()),
                    jsonObject.get("eyeColor").toString(),
                    jsonObject.get("name").toString(),
                    jsonObject.get("gender").toString(),
                    jsonObject.get("company").toString(),
                    jsonObject.get("email").toString(),
                    jsonObject.get("phone").toString(),
                    jsonObject.get("address").toString(),
                    jsonObject.get("registered").toString(),
                    jsonObject.get("tags").toString(),
                    jsonObject.get("favoriteFruit").toString());
            people.add(person);
        }
        return people;
    }

    public List getAgesGuid(List<Person> people, int minAge, int maxAge){
        List ages = new ArrayList();
        for (int i = 0; i < people.size(); i++) {
            int age = people.get(i).getAge();
            if(age >= minAge && age <= maxAge) {
                ages.add(age);
            }
        }
         return ages;
    }
}
