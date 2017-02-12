package Commands;

import answerPackage.Answer;

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


        if(answerText.endsWith("/search")){
            Answer answer = new Answer(answerText.substring(0, 6), null);
            return answer;
        }
        else{
            Answer answer = new Answer(answerText.substring(0, 6), null);
            return answer;
        }

    }
}
