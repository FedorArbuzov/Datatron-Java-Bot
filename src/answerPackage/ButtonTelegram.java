package answerPackage;

/**
 * Created by fedor on 12.02.17.
 */
public class ButtonTelegram {

    private String text;
    private String callbackData;
    private String url;

    public ButtonTelegram(String _text, String _callbackData, String _url){

        text = _text;
        callbackData = _callbackData;
        url = _url;

    }


}
