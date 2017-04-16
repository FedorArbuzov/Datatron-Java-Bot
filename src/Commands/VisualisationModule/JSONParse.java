package Commands.VisualisationModule;
import org.apache.http.ParseException;
import org.json.JSONObject;
import org.json.JSONArray;



/**
 * Created by fedor on 12.04.17.
 */
public class JSONParse {

    public static void parseJSON(){
        JSONObject resultJson = new JSONObject();

        resultJson.put("name","foo");
        resultJson.put("num",new Integer(100));
        resultJson.put("is_vip",new Boolean(true));


        System.out.println(resultJson.toString());

        JSONArray ar = new JSONArray();
        JSONObject obj = new JSONObject();
        JSONObject resultJson1 = new JSONObject();

        ar.put("first");
        ar.put(100);

        obj.put("one", "two");
        obj.put("three", "four");

        resultJson1.put("paramsArray", ar);
        resultJson1.put("paramsObj", obj);
        resultJson1.put("paramsStr", "some string");
        System.out.println(resultJson1.toString());

        String s = "{\"paramsObj\":{\"one\":\"two\",\"three\":\"four\"},\"paramsArray\":[\"first\",100],\"paramsStr\":\"some string\"}";

        JSONObject o = new JSONObject(s);

        JSONArray arrayOfTests = (JSONArray)o.get("paramsArray");

        for (int i = 0; i < arrayOfTests.length(); i++) {
            System.out.println(arrayOfTests.get(i));
        }
    }

}



