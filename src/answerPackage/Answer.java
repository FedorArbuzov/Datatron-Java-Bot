package answerPackage;

import java.util.List;

/**
 * Created by fedor on 12.02.17.
 */
public class Answer {

    private String textAnswer = null;
    private List<List<ButtonTelegram>> matrixButton = null;

    public Answer(String _textAnswer, List<List<ButtonTelegram>> _matrixButton){

        textAnswer = _textAnswer;
        matrixButton = _matrixButton;

    }

    public String getTextAnswer(){
        return textAnswer;
    }

    public List<List<ButtonTelegram>> getMatrixButton(){
        return matrixButton;
    }

}
