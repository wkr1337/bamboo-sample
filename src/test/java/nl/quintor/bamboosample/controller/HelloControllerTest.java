package nl.quintor.bamboosample.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloControllerTest {

    private HelloController helloController;

    @Before
    public void setUp() throws Exception {
        helloController = new HelloController();
    }

    @Test
    public void index() {
        String expected = "Hello world!";
        String actual = this.helloController.index();
        assertEquals(expected, actual);
    }
}