package com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.CalculableArea;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public interface CalculableAreaOnTheParameters<T> extends CalculableArea {

    T calculateArea(T tFirst, T tSecond);

}
