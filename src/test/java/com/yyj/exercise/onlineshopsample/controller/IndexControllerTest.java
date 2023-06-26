package com.yyj.exercise.onlineshopsample.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void loadingMainPage() {
        // given

        // when
        String body = this.testRestTemplate.getForObject("/", String.class);

        // then
        assertThat(body).contains("Use Spring Boot for Sample Online Shop");
    }
}
