/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg70testovani;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import pkg70testovani.trida;



/**
 *
 * @author lmasic
 */
public class TridaTest {

    public trida toTest;

    @Before
    public void prepare() {
        toTest = new trida("");
        
    }

    @Test
    public void testShortValueSetting() {
        // generate String of acceptable length for the container
        String expected = ofSpecificLength(trida.MAX_VALUE_LENGTH);
        toTest.setValue(expected);
        assertEquals("Container hasn't set the short string properly", expected, toTest.getValue());
    }

    @Test
    public void testLongValueSetting() {
        // generate String of not acceptable length for the container
        String value = ofSpecificLength(trida.MAX_VALUE_LENGTH + 1);
        toTest.setValue(value);
        String expected = value.substring(0, trida.MAX_VALUE_LENGTH - 3) + "...";
        assertEquals("Container hasn't set the long string properly", expected, toTest.getValue());
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testNullSetting() {
        exception.expect(IllegalArgumentException.class);
        toTest.setValue(null);
    }

    
    private String ofSpecificLength(int length) {
        return Stream.generate(() -> String.valueOf('x')).limit(length).collect(Collectors.joining());
    }

    
}
