package Commands;

import answerPackage.Answer;
import answerPackage.ButtonTelegram;

import java.util.ArrayList;

/**
 * Created by fedor on 12.02.17.
 */
public class SearchCommand extends Command {

    public SearchCommand(String _answerText){
        super(_answerText);
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
            Answer answer = new Answer(answerText.substring(0, 6), null);
            return answer;
        }

    }
}
