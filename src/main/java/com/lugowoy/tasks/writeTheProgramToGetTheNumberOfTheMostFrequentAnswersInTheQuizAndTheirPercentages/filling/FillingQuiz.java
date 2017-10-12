package com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.filling;

import com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.Factory;
import com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.OptionFactory;
import com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;

import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 09.04.2017. */

public class FillingQuiz<T extends Enum> implements Fillable<T> {

    @Override
    public void fillOptionListForQuiz(Quiz quiz, Class<T> valueEnumClass) {
        Factory<Option> optionFactory = new OptionFactory()::createModel;
        List<Option> optionList = new ArrayList<>(0);

        for (Enum value : valueEnumClass.getEnumConstants()) {
            Option option = optionFactory.create();
            option.setValueForOption(value);

            optionList.add(option);
        }
        quiz.setOptionList(optionList);
    }

}
