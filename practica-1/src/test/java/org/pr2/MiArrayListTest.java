package org.pr2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class MiArrayListTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void listaVaciaTamaño0True(){
        MiArrayList<Integer> lista = new MiArrayList<>();
        assertTrue(lista.isEmpty());
    }

    @Test
    public void listaConMasDeUnElementoFalse(){
        MiArrayList<Integer> lista = new MiArrayList<>();
        lista.add(2);
        assertFalse(lista.isEmpty());
    }


}
