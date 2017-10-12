package com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public interface CalculablePercentOfTheAreaOfTheObjectsFromTheRoomArea {

    BigDecimal calculatePercentage(Room room);

}
