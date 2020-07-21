package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
    CalculatorService calculatorService=new CalculatorService();
    @Test
    public void testSum() {

        Assertions.assertEquals(30,calculatorService.sum());
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(200,calculatorService.multiply());
    }

    @Test
    public void testMinus() {
        Assertions.assertEquals(10,calculatorService.minus());
    }
    @Test
    public void testDiv() {
        Assertions.assertEquals(2,calculatorService.div());
    }
    @Test
    public void testCompositeMultiply() {
        Assertions.assertEquals(600,calculatorService.compMultiply());
    }
    @Test
    public void testSumFail() {
        Assertions.assertNotEquals(10,calculatorService.sum());
    }
    @Test
    public void testMultiplyFail() {
        Assertions.assertNotEquals(20,calculatorService.multiply());
    }

    @Test
    public void testDivFail() {
        Assertions.assertNotEquals(20,calculatorService.div());
    }
    @Test
    public void testMinusFail() {
        Assertions.assertNotEquals(20,calculatorService.minus());
    }
}