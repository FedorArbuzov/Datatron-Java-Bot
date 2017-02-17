package answerPackage;

/**
 * Created by fedor on 17.02.17.
 */
public class CallbackAnswer {

    private String callbackAnswer;

    public CallbackAnswer(String _callbackAnswer){

        callbackAnswer = _callbackAnswer;

    }

    public Answer getAnswer(){

     //   CallbackAnswer callback = CallbackAnswer(callbackAnswer);
     //   return callback.getAnswer();
        Answer answer = new Answer("Вы нажали на кнопку!", null);
        return answer;
    }
}
