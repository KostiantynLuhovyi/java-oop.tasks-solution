package com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory;

import com.lugowoy.tasks.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class QuizFactory extends ModelFactory<Quiz> {

    @Override
    public Quiz createModel() {
        return new Quiz();
    }

}
