package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true); // old test (leave it)
    }

    // 👇 NEW TEST 1
    @Test
    void testAdd() {
        assertEquals(5, App.add(2,3));
    }

    // 👇 NEW TEST 2
    @Test
    void testAddNegative() {
        assertEquals(-1, App.add(2,-3));
    }
}
