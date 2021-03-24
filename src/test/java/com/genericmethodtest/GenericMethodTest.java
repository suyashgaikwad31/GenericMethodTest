package com.genericmethodtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericMethodTest {
    @Test
    public void givenIntegers_WriteFirstIntergerIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        Integer value = genericMethod.testMaximum(5, 4, 3);
        Assertions.assertEquals(5, value);
    }

    @Test
    public void givenIntegers_WriteSecondIntergerIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        Integer value = genericMethod.testMaximum(4, 5, 3);
        Assertions.assertEquals(5, value);
    }

    @Test
    public void givenIntegers_WriteThirdntergerIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        Integer value = genericMethod.testMaximum(3, 4, 5);
        Assertions.assertEquals(5, value);
    }
}
