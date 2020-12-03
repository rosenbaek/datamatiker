package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BogTest {

    @Test
    void getISBN() {
        Bog bog = new Bog(5555, "Corona", 2020);
        int expected = 5555;
        int actual = bog.getISBN();
        assertEquals(expected,actual);
    }
}