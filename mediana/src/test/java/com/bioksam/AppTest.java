package com.bioksam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestaMediana()
    {
        Mediana mediana = new Mediana();

        assertEquals("3", mediana.mediana("1 5 3 4 2"));
        assertEquals("4", mediana.mediana("4 2 7"));
        assertEquals("3", mediana.mediana("1 2 2 3 4 5 7"));
    }
}
