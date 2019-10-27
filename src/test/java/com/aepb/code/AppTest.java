package com.aepb.code;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class AppTest {

    private App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
    }

    @Test
    public void should_get_hello_word() {
        assertThat(app.helloWord()).isEqualTo("hello word");
    }
}