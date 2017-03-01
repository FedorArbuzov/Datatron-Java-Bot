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


            // FIRST VARIANT

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

            // Text: Все; Callback: TNTMoney; Url: null
            // Text: Налоговые; Callback: TaxMoney; Url: null
            // Text: Неналоговые; Callback: NonTaxMoney; Url: null
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

            case "Deficit":case "TNTMoney":case "TaxMoney":case "NonTaxMoney":case "GovernmentQ":
            case "NationalDefence":case "NationalSecurity":case "NationalEconomics":case "Education":
            case "HSC":case "Culture":case "Sports":case "SocialPolicy":case "Medicine":
            case "EnvironmentProtection":case "OtherSpendings":
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

            case "Planned":case "Fact":
                _textAnswer = "Данные какого года вас интересуют?";

                matrixButton = new ArrayList<>();

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("2007", "2007", null));
                buttonRow.add(new ButtonTelegram("2008", "2008", null));
                buttonRow.add(new ButtonTelegram("2009", "2009", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("2010", "2010", null));
                buttonRow.add(new ButtonTelegram("2011", "2011", null));
                buttonRow.add(new ButtonTelegram("2012", "2012", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("2013", "2007", null));
                buttonRow.add(new ButtonTelegram("2014", "2008", null));
                buttonRow.add(new ButtonTelegram("2015", "2009", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("2016", "2016", null));
                buttonRow.add(new ButtonTelegram("2017", "2017", null));
                matrixButton.add(buttonRow);

                answer = new Answer(_textAnswer, matrixButton);
                return answer;

            case "2007":case "2008":case "2009":case "2010":case "2011":
            case "2012":case "2013":case "2014":case "2015":case "2016":
            case "2017":case "Current":

                _textAnswer = "Выберите территорию:";

                matrixButton = new ArrayList<>();

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Федеральный бюджет", "FederalBudget", null));
                buttonRow.add(new ButtonTelegram("Россия", "Russia", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Москва", "Moscow", null));
                buttonRow.add(new ButtonTelegram("Московская область", "MoscowState", null));
                matrixButton.add(buttonRow);

                buttonRow = new ArrayList<>();
                buttonRow.add(new ButtonTelegram("Другие", "Other", null));
                matrixButton.add(buttonRow);

                answer = new Answer(_textAnswer, matrixButton);
                return answer;

            case "Other":
                _textAnswer = "Чтобы узнать информацию о других субъектах России введите, /cr *название региона* (например, /cr Рязанская область)";


                answer = new Answer(_textAnswer, null);
                return answer;

        }

        answer = new Answer("НЕ ЛЕЗЬ !!!!", null);
        return answer;
    }
}
