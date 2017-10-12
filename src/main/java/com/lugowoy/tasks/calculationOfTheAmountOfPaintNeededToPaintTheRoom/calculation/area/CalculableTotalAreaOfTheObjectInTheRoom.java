package com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;
import java.util.List;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public interface CalculableTotalAreaOfTheObjectInTheRoom<T> {

    BigDecimal calculateTotalAreaOfTheObjectInTheRoom(Room room);

    BigDecimal calculateTotalAreaOfTheObjectInTheRoom(List<T> tList);

}
