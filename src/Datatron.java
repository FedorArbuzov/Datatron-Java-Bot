import answerPackage.Answer;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Audio;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;


class Datatron extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        Long userId = null;
        String messageText = null;
        String callbackData = null;
        Audio audio = null;

        if(update.hasMessage() && update.getMessage().hasText()) {
            messageText = update.getMessage().getText();
            userId = update.getMessage().getChatId();
        }

        if(update.hasCallbackQuery()){
            callbackData = update.getCallbackQuery().getData();
            userId = update.getCallbackQuery().getMessage().getChatId();
        }

        // TODO: create audio hendler
        if(update.getMessage().getAudio() != null){
            audio = update.getMessage().getAudio();
            userId = update.getMessage().getChatId();
        }

        MessageHandler messageFromUser = new MessageHandler(userId, messageText, callbackData, audio);
        Answer answer = messageFromUser.getAnswer();

        if(answer.getMatrixButton() == null){

            //            System.out.println(update.getCallbackQuery().getData());
                SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                        .setChatId(messageFromUser.getChatId())
                        .setText(answer.getTextAnswer());
                try {
                    sendMessage(message); // Call method to send the message
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

        }
        else{

            // TODO : create answer with matrix

        }

//        //System.out.println(update);
//
//        if(update.hasCallbackQuery()){
//            System.out.println(update.getCallbackQuery().getData());
//                SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
//                        .setChatId(update.getCallbackQuery().getMessage().getChatId())
//                        .setText(update.getCallbackQuery().getData());
//                try {
//                    sendMessage(message); // Call method to send the message
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//        }
//
//
//        // get text from bot
//        if (update.hasMessage() && update.getMessage().hasText()) {
//
//            String messageText = update.getMessage().getText();
//
//            if(messageText.startsWith("/start")) {
//                SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
//                        .setChatId(update.getMessage().getChatId())
//                        .setText(Commands.ConstantsCommands.START_MSG);
//                try {
//                    sendMessage(message); // Call method to send the message
//                    } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if(messageText.startsWith("/help")){
//
//
//                SendMessage message = new SendMessage();
//                message.setText("First message without command");
//                message.setChatId(update.getMessage().getChatId());
//                InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
//                List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
//                List<InlineKeyboardButton> row = new ArrayList<>();
//                InlineKeyboardButton button = new InlineKeyboardButton();
//                button.setText("Edit message");
//                //button.setCallbackData("");
//                button.setUrl("https://youtu.be/swok2pcFtNI");
//
//                row.add(button);
//                keyboard.add(row);
//                markup.setKeyboard(keyboard);
//                message.setReplyMarkup(markup);
//                try {
//                    sendMessage(message);
//                } catch (Throwable e) {
//                    e.printStackTrace();
//                }
////                SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
////                        .setChatId(update.getMessage().getChatId())
////                        .setText(Commands.ConstantsCommands.HELP_MSG);
////                try {
////                    sendMessage(message); // Call method to send the message
////                    } catch (TelegramApiException e) {
////                    e.printStackTrace();
////                }
//
//            }
//
//            if(messageText.startsWith("/search")){
//                if(messageText.endsWith("/search")){
//
//
//                }
//                else{
//                    //TODO: top machine learning algorithm
//                }
//            }
//        }
//    }
//
//    public void sendCustomKeyboard(String chatId) {
//        SendMessage message = new SendMessage();
//        message.setChatId(chatId);
//        message.setText("Custom message text");
//
//        // Create ReplyKeyboardMarkup object
//        InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
//        // Create the keyboard (list of keyboard rows)
//        List<InlineKeyboardButton> keyboard = new ArrayList<>();
//        InlineKeyboardButton button = new InlineKeyboardButton();
//        // Create a keyboard row
//        KeyboardRow row = new KeyboardRow();
//        // Set each button, you can also use KeyboardButton objects if you need something else than text
//        row.add("Row 1 Button 1");
//        row.add("Row 1 Button 2");
//        row.add("Row 1 Button 3");
//        // Add the first row to the keyboard
//
//        // Create another keyboard row
//        row = new KeyboardRow();
//        // Set each button for the second line
//        row.add("Row 2 Button 1");
//        row.add("Row 2 Button 2");
//        row.add("Row 2 Button 3");
//        // Add the second row to the keyboard
//        keyboard.add(button);
//        // Set the keyboard to the markup
//        List<List<InlineKeyboardButton>> kb1 = new ArrayList<>();
//        keyboardMarkup.setKeyboard(kb1);
//        // Add it to the message
//        message.setReplyMarkup(keyboardMarkup);
//
//        try {
//            // Send the message
//            sendMessage(message);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "myamazingbot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "266507345:AAE7WYiv2nm_u9Hf0CaO2saDZNYuMrQsfsU";
    }
}