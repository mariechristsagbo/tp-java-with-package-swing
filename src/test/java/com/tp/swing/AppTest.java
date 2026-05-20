package com.tp.swing;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void mainClassCanBeLoaded() {
        assertDoesNotThrow(() -> Class.forName("com.tp.swing.Main"));
    }
}
