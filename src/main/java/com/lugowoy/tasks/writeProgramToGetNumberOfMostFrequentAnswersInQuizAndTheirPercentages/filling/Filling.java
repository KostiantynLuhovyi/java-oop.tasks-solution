package com.lugowoy.tasks.writeProgramToGetNumberOfMostFrequentAnswersInQuizAndTheirPercentages.filling;

import com.lugowoy.tasks.writeProgramToGetNumberOfMostFrequentAnswersInQuizAndTheirPercentages.models.Quiz;

/** Created by Konstantin Lugowoy on 09.04.2017. */

@FunctionalInterface
public interface Filling<T extends Enum> {

    void fillOptionListForQuiz(Quiz quiz, Class<T> valueEnumClass);

}
