package com.lugowoy.tasks.calculationOfAmountOfPaintNeededToPaintRoom.calculating.area;

import com.lugowoy.tasks.calculationOfAmountOfPaintNeededToPaintRoom.models.Room;

import java.math.BigDecimal;
import java.util.List;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public interface CalculatingTotalAreaOfObjectInRoom<T> {

    BigDecimal calculateTotalAreaOfObjectInRoom(Room room);

    BigDecimal calculateTotalAreaOfObjectInRoom(List<T> tList);

}
