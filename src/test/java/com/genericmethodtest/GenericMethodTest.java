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

    @Test
    public void givenFloat_WriteFirstFloatIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        Float value = genericMethod.testMaximum(6.6f, 8.8f, 7.7f);
        Assertions.assertEquals(8.8f, value);
    }

    @Test
    public void givenFloat_WriteSecondFloatIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        Float value = genericMethod.testMaximum(8.8f, 6.6f, 7.7f);
        Assertions.assertEquals(8.8f, value);
    }

    @Test
    public void givenFloat_WriteThirdFloatIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        Float value = genericMethod.testMaximum(7.7f, 6.6f, 8.8f);
        Assertions.assertEquals(8.8f, value);
    }

    @Test
    public void givenString_WriteFirstStringIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        String value = genericMethod.testMaximum("pear", "apple", "orange");
        Assertions.assertEquals("pear", value);

    }

    @Test
    public void givenString_WriteSecondStringIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        String value = genericMethod.testMaximum("apple", "pear", "orange");
        Assertions.assertEquals("pear", value);

    }

    @Test
    public void givenString_WriteThirdStringIsMaximum_ReturnValue() {
        GenericMethod genericMethod = new GenericMethod();
        String value = genericMethod.testMaximum("orange", "apple", "pear");
        Assertions.assertEquals("pear", value);

    }
}