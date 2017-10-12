package com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public class CalculatorForTheRoomArea extends CalculatorForTheObjectArea<Room> {

    @Override
    public void calculateArea(Room room) {
        BigDecimal areaTwoWallsDefiningTheWidthOfTheRoom
                = new BigDecimal(room.getWidthRoom().multiply(room.getHeightRoom().multiply(new BigDecimal(2))).doubleValue());
        BigDecimal areaTwoWallsDefiningTheLengthOfThRoom
                = new BigDecimal(room.getLengthRoom().multiply(room.getHeightRoom().multiply(new BigDecimal(2))).doubleValue());

        room.setTotalAreaRoom(areaTwoWallsDefiningTheWidthOfTheRoom.add(areaTwoWallsDefiningTheLengthOfThRoom));
    }

}
