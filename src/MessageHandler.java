import Commands.HelpCommand;
import Commands.SearchCommand;
import Commands.StartCommand;
import answerPackage.Answer;
import answerPackage.CallbackAnswer;
import org.telegram.telegrambots.api.objects.Audio;

/**
 * Created by fedor on 12.02.17.
 */
public class MessageHandler {


    private Long chatId;
    private String text;
    private String callbackData;
    private Audio audio;

    public MessageHandler(Long _chatId, String _text, String _callbackData, Audio _audio){

        chatId = _chatId;
        text = _text;
        callbackData = _callbackData;
        audio = _audio;

    }

    public Long getChatId(){
        return chatId;
    }

    public Answer getAnswer(){

        if(text != null){

            if(text.startsWith("/start")){

                StartCommand start = new StartCommand(text);
                return start.getAnswer();

            }
            else if(text.startsWith("/help")){

                HelpCommand help = new HelpCommand(text);
                return help.getAnswer();
            }

            else if(text.startsWith("/search")){
                SearchCommand search = new SearchCommand(text);
                return search.getAnswer();
            }
            else if(text.startsWith("/cr")){

            }
            else{

                //TODO: AWESOME MACHINE LEARNING ALGORITHM


            }

        }
        else if(callbackData != null){

            CallbackAnswer callbackAnswer = new CallbackAnswer(callbackData);
            return callbackAnswer.getAnswer();
        }

        return null;
    }


}
