package com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.CalculableArea;
import com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 22-Feb-17. */

@FunctionalInterface
public interface CalculableAreaOfTheRoomWithoutDoorsAndWindows extends CalculableArea {

    BigDecimal calculateAreaOfTheRoomWithoutDoorsAndWindows(Room room);

    default BigDecimal calculate(Room room) {
        return room.getTotalAreaRoom().subtract(room.getTotalAreaOfTheDoorsInTheRoom()).subtract(room.getTotalAreaOfTheWindowsInTheRoom());
    }

}
