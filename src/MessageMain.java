import org.telegram.telegrambots.api.objects.Audio;

/**
 * Created by fedor on 12.02.17.
 */
public class MessageMain {


    private Long chatId;
    private String text;
    private String callbackData;
    private Audio audio;

    public MessageMain(Long _chatId, String _text, String _callbackData, Audio _audio){
        chatId = _chatId;
        text = _text;
        callbackData = _callbackData;
        audio = _audio;
    }


}
