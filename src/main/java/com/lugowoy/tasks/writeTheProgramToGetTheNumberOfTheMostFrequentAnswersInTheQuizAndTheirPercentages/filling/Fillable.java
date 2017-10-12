package com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.filling;

import com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;

/** Created by Konstantin Lugowoy on 09.04.2017. */

@FunctionalInterface
public interface Fillable<T extends Enum> {

    void fillOptionListForQuiz(Quiz quiz, Class<T> valueEnumClass);

}
