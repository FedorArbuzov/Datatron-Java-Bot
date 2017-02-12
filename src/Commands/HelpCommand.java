package Commands;

import answerPackage.Answer;

/**
 * Created by fedor on 12.02.17.
 */
public class HelpCommand extends  Command {

    public HelpCommand(String _answerText){
        super(_answerText);
    }

    @Override
    public Answer getAnswer(){
        Answer answer = new Answer(ConstantsCommands.HELP_MSG, null);

        return answer;
    }
}
