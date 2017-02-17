package Commands;

import answerPackage.Answer;
import answerPackage.ButtonTelegram;
import answerPackage.ListButtonTelegram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by fedor on 12.02.17.
 */
public class HelpCommand extends  Command {

    public HelpCommand(String _answerText){
        super(_answerText);
    }

    @Override
    public Answer getAnswer(){


        // Text: Руководство пользователя; Callback: FullDocumentation; Url: null
        // Text: Смотреть ролик; Callback: WatchMovie; Url: https://www.youtube.com/watch?v=swok2pcFtNI
        // Text: Оценить; Callback: Rate; Url: https://telegram.me/storebot?start=datatron_bot

        ArrayList<ArrayList<ButtonTelegram>> matrixButton = new ArrayList<>();

        ArrayList<ButtonTelegram> buttonRow = new ArrayList<>();
        buttonRow.add(new ButtonTelegram("Руководство пользователя", "FullDocumentation", null));
        matrixButton.add(buttonRow);

        buttonRow = new ArrayList<>();
        buttonRow.add(new ButtonTelegram("Смотреть ролик", "WatchMovie", "https://www.youtube.com/watch?v=swok2pcFtNI"));
        matrixButton.add(buttonRow);

        buttonRow = new ArrayList<>();
        buttonRow.add(new ButtonTelegram("Оценить", "Rate", "https://telegram.me/storebot?start=datatron_bot"));
        matrixButton.add(buttonRow);

        Answer answer = new Answer(ConstantsCommands.HELP_MSG, matrixButton);
        return answer;
    }
}
