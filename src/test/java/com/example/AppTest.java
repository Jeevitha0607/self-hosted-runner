package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApplicationMessage() {

        App app = new App();

        assertEquals(
            "Hello from GitHub Actions",
            app.getMessage()
        );

    }
}
