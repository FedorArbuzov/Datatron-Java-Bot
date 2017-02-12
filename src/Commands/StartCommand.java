package Commands;

import answerPackage.Answer;

/**
 * Created by fedor on 12.02.17.
 */
public class StartCommand {

    private String answerText;

    public StartCommand(String _answerText){
        answerText = _answerText;
    }

    public Answer getAnswer(){
        Answer answer = new Answer(ConstantsCommands.START_MSG, null);

        return answer;
    }
}
