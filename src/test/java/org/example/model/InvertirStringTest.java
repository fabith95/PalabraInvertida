package org.example.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.example.model.InvertirString.hacerRevez;

public class InvertirStringTest {

    @Test
    void encontrarPalabra(){
        String vectorString[] = {"o","l","l","e","h"};
        Assertions.assertArrayEquals(vectorString, InvertirString.hacerRevez());

    }
}
