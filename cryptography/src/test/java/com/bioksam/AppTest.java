package com.bioksam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        Encripta encripta = new Encripta();
        assertEquals("taoa eum nmd hbi", encripta.criptografar("tenha um bom dia"));

        assertEquals("omd luo an", encripta.criptografar("ola mundo"));
    }
}
