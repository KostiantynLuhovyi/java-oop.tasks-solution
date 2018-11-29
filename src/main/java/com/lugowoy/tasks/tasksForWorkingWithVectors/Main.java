package com.lugowoy.tasks.tasksForWorkingWithVectors;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

import java.math.BigDecimal;

/**
 * Created by Konstantin Lugowoy on 29.11.2018.
 */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Fill in the first vector.");
        Vector2D<BigDecimal> firstVector2D = new Vector2D<>();
        fillVector2D(firstVector2D);

        System.out.println("Fill in the second vector.");
        Vector2D<BigDecimal> secondVector2D = new Vector2D<>();
        fillVector2D(secondVector2D);

        CalculationVector2D<BigDecimal> calculation = CalculationVector2D::calculateAdditionOfVectors;
        System.out.println("Result summation : " + calculation.calculate(firstVector2D, secondVector2D));
        calculation = CalculationVector2D::calculateSubtractionOfVectors;
        System.out.println("Result subtraction : " + calculation.calculate(firstVector2D, secondVector2D));
        calculation = CalculationVector2D::calculateMultiplicationOfVectors;
        System.out.println("Result multiplication : " + calculation.calculate(firstVector2D, secondVector2D));

    }

    private static void fillVector2D(Vector2D<BigDecimal> vector) {
        System.out.println("Enter X value : ");
        vector.setX(new BigDecimal(READER.readDouble()));
        System.out.println("Enter Y value : ");
        vector.setY(new BigDecimal(READER.readDouble()));
    }

}
