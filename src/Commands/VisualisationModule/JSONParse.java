package Commands.VisualisationModule;
import org.apache.http.ParseException;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONString;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by fedor on 12.04.17.
 */
public class JSONParse {

    public static String parseJSON(String json){

        JSONObject o = new JSONObject(json);
        System.out.println(o);
        String cntkResponse = null;
        String response = null;
        try {
            cntkResponse = (String) o.get("cntk_response");
            response = (String) o.get("response");
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println("ok");
        System.out.println(cntkResponse);
        /*
        ArrayList<String> arr = new ArrayList<>();
        arr.add(cntkResponse);
        arr.add(response);
        */
        return "CNTK: " + cntkResponse + "\n" + "SOLR: " + response;
    }

}



