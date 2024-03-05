package test;
import main.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {

    Calculator calculator;
    @BeforeEach
    void setup(){
        this.calculator = new Calculator();
    }
    @Test
    public void testAdditionMethodWithTwoInputs(){
       ArrayList<Integer> mockInputs = new ArrayList<>(Arrays.asList(3, 5));
       double expectedResult = 8;

       assertEquals(expectedResult, calculator.add(mockInputs));
    }
    @Test
    public void testAdditionMethodWithFiveInputs(){
        ArrayList<Integer> mockInputs = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        int expectedResult = 5;

        assertEquals(expectedResult, calculator.add(mockInputs));
    }

    @Test
    public void testSubtractionWithTwoInputs(){
        ArrayList<Integer> mockInputs = new ArrayList<>(Arrays.asList(10, 5));
        int expectedResult = 5;
        assertEquals(expectedResult, calculator.minus(mockInputs));
    }

    @Test
    public void testSubtractionWithThreeInputs(){
        ArrayList<Integer> mockInputs = new ArrayList<>(Arrays.asList(15, 5, 5));
        int expectedResult = 5;
        assertEquals(expectedResult, calculator.minus(mockInputs));
    }

    @Test
    public void testMultiplyWithTwoInputs(){
        ArrayList<Integer> mockInputs = new ArrayList<>(Arrays.asList(2, 2));
        int expectedResult = 4;
        assertEquals(expectedResult, calculator.multiply(mockInputs));
    }

    @Test
    public void testMultiplyWithThreeInputs(){
        ArrayList<Integer> mockInputs = new ArrayList<>(Arrays.asList(2, 2, 2));
        int expectedResult = 8;
        assertEquals(expectedResult, calculator.multiply(mockInputs));
    }

    @Test
    public void testDivisionWithTwoInputs(){
        ArrayList<Integer> mockInputs = new ArrayList<>(Arrays.asList(4, 2));
        int expectedResult = 2;
        assertEquals(expectedResult, calculator.divide(mockInputs));
    }
    @Test
    public void testDivisionWithThreeInputs(){
        ArrayList<Integer> mockInputs = new ArrayList<>(Arrays.asList(4, 2, 2));
        int expectedResult = 1;
        assertEquals(expectedResult, calculator.divide(mockInputs));
    }
}
