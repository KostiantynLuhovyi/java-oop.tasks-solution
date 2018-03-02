package com.lugowoy.tasks.writeProgramToGetNumberOfMostFrequentAnswersInQuizAndTheirPercentages.factory;

import com.lugowoy.tasks.writeProgramToGetNumberOfMostFrequentAnswersInQuizAndTheirPercentages.models.Quiz;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class QuizFactory extends ModelFactory<Quiz> {

    @Override
    public Quiz createModel() {
        return new Quiz();
    }

}
