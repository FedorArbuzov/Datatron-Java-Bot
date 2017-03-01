package answerPackage;

import Commands.ConstantsCommands;

import java.util.ArrayList;

/**
 * Created by fedor on 17.02.17.
 */
public class CallbackAnswer {

    // Text: Доходы; Callback: Revenues; Url: null
    // Text: Расходы; Callback: Spendings; Url: null
    // Text: Дефицит; Callback: Deficit; Url: null

    // Text: Налоговые; Callback: TaxMoney; Url: null
    // Text: Неналоговые; Callback: NonTaxMoney; Url: null

    // Text: Плановые; Callback: Planned; Url: null
    // Text: Фактические; Callback: Fact; Url: null
    // Text: Текущие; Callback: Current; Url: null


    // Text: Национальная оборона; Callback: NationalDefence; Url: null
    // Text: Национальная безопасность; Callback: NationalSecurity; Url: null
    // Text: Национальная экономика; Callback: NationalEconomics; Url: null
    // Text: Образование; Callback: Education; Url: null
    // Text: ЖКХ; Callback: HSC; Url: null
    // Text: Культура; Callback: Culture; Url: null
    // Text: Спорт; Callback: Sports; Url: null
    // Text: Социальная политика; Callback: SocialPolicy; Url: null
    // Text: Защита окружающей среды; Callback: EnvironmentProtection; Url: null
    // Text: Общие расходы; Callback: OtherSpendings; Url: null

    // Text: Руководство пользователя; Callback: FullDocumentation; Url: null
    // Text: Смотреть ролик; Callback: WatchMovie; Url: https://www.youtube.com/watch?v=swok2pcFtNI
    // Text: Оценить; Callback: Rate; Url: https://telegram.me/storebot?start=datatron_bot

    private String callbackAnswer;

    public CallbackAnswer(String _callbackAnswer){

        callbackAnswer = _callbackAnswer;

    }

    public Answer getAnswer(){

        Answer answer;
        String _textAnswer;

        ArrayList<ArrayList<ButtonTelegram>> matrixButton = new ArrayList<>();

        ArrayList<ButtonTelegram> buttonRow = new ArrayList<>();

        switch (callbackAnswer){


            // Text: Доходы; Callback: Revenues; Url: null
            // Text: Расходы; Callback: Spendings; Url: null
            // Text: Дефицит; Callback: Deficit; Url: null

            case "Revenues":
                    _textAnswer = "Налоговые или неналоговые?";

                // Text: Все; Callback: TNTMoney; Url: null
                // Text: Налоговые; Callback: TaxMoney; Url: null
                // Text: Неналоговые; Callback: NonTaxMoney; Url: null

                matrixButton = new ArrayList<>();

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Все", "TNTMoney", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Налоговые", "TaxMoney", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Неналоговые", "NonTaxMoney", null));
                matrixButton.add(buttonRow);

                answer = new Answer(_textAnswer, matrixButton);
                return answer;


            case "Spendings":
                _textAnswer = "Какая сфера расходов вас интересует?";



                // Text: Общегосударственные вопросы; Callback: GovernmentQ ; Url: null
                // Text: Национальная оборона; Callback: NationalDefence; Url: null
                // Text: Национальная безопасность; Callback: NationalSecurity; Url: null
                // Text: Национальная экономика; Callback: NationalEconomics; Url: null
                // Text: Образование; Callback: Education; Url: null
                // Text: ЖКХ; Callback: HSC; Url: null
                // Text: Культура; Callback: Culture; Url: null
                // Text: Спорт; Callback: Sports; Url: null
                // Text: Социальная политика; Callback: SocialPolicy; Url: null
                // Text: Здравоохранение; Callback: Medicine; Url: null
                // Text: Защита окружающей среды; Callback: EnvironmentProtection; Url: null
                // Text: Общие расходы; Callback: OtherSpendings; Url: null

                matrixButton = new ArrayList<>();

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Общегосударственные вопросы", "GovernmentQ", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Национальная оборона", "NationalDefence", null));
                buttonRow.add(new ButtonTelegram("Образование", "Education", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Национальная безопасность", "NationalSecurity", null));
                buttonRow.add(new ButtonTelegram("Национальная экономика", "NationalEconomics", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("ЖКХ", "HSC", null));
                buttonRow.add(new ButtonTelegram("Культура", "Culture", null));
                buttonRow.add(new ButtonTelegram("Спорт", "Sports", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Защита окружающей среды", "EnvironmentProtection", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Здравоохранение", "Medicine", null));
                buttonRow.add(new ButtonTelegram("Социальная политика", "SocialPolicy", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Общие расходы", "OtherSpendings", null));
                matrixButton.add(buttonRow);

                answer = new Answer(_textAnswer, matrixButton);
                return answer;

            case "Deficit":
                _textAnswer = "Выберите тип:";

                // Text: Плановые; Callback: Planned; Url: null
                // Text: Фактические; Callback: Fact; Url: null
                // Text: Текущие; Callback: Current; Url: null

                matrixButton = new ArrayList<>();

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Плановые", "Planned", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Фактические", "Fact", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Текущие", "Current", null));
                matrixButton.add(buttonRow);

                answer = new Answer(_textAnswer, matrixButton);
                return answer;

        }

        answer = new Answer("Вы нажали на кнопку!", null);
        return answer;
    }
}
