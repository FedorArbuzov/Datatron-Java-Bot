package Commands;

import answerPackage.Answer;
import answerPackage.ButtonTelegram;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by fedor on 12.02.17.
 */
public class SearchCommand extends Command {

    public SearchCommand(String _answerText){
        super(_answerText);
    }




    private String resultLine="";

    private void makeRec(String url) throws Exception {

        URL getURL = new URL(url);
        URLConnection yc = getURL.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            resultLine += inputLine;
        }
        in.close();
    }

    @Override
    public Answer getAnswer(){

        //TODO: create db connection
        // Text: Доходы; Callback: Revenues; Url: null
        // Text: Расходы; Callback: Spendings; Url: null
        // Text: Дефицит; Callback: Deficit; Url: null

        if(answerText.endsWith("/search")){

            ArrayList<ArrayList<ButtonTelegram>> matrixButton = new ArrayList<>();

            ArrayList<ButtonTelegram> buttonRow = new ArrayList<>();
            buttonRow.add(new ButtonTelegram("Доходы", "Revenues", null));
            matrixButton.add(buttonRow);

            buttonRow = new ArrayList<>();
            buttonRow.add(new ButtonTelegram("Расходы", "Spendings", null));
            matrixButton.add(buttonRow);

            buttonRow = new ArrayList<>();
            buttonRow.add(new ButtonTelegram("Дефицит", "Deficit", null));
            matrixButton.add(buttonRow);

            Answer answer = new Answer(ConstantsCommands.SEARCH_STEP1, matrixButton);
            return answer;
        }
        else{
            try {
                //System.out.println(makeRec("http://127.0.0.1/hello"));
                //return null;

                String delims = "[ ]";
                String[] tokens = answerText.split(delims);

                System.out.println(tokens[1]);

                String str="http://127.0.0.1:8019/"+tokens[1];

                System.out.println(answerText);
                System.out.println(str);


                makeRec(str);
                System.err.println(resultLine);
                Answer answer = new Answer(resultLine, null);
                return answer;
            }
            catch (Exception ex){

                System.out.println("Hello error");
                return null;

            }
        }

    }
}
