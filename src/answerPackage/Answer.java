package answerPackage;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fedor on 12.02.17.
 */
public class Answer {

    private String textAnswer = null;
    private boolean hasMarixButton;
    private ArrayList<ArrayList<ButtonTelegram>> matrixButton = null;

    public Answer(String _textAnswer, ArrayList<ArrayList<ButtonTelegram>> _matrixButton){

        textAnswer = _textAnswer;
        matrixButton = _matrixButton;

    }

    public String getTextAnswer(){
        return textAnswer;
    }


    public ArrayList<ArrayList<ButtonTelegram>> getMatrixButton(){
        return matrixButton;
    }

}
