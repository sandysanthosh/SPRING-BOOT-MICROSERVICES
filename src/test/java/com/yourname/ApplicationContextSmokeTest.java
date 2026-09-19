package com.yourname;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class)
public class ApplicationContextSmokeTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void contextLoads() {
        // The test passes when the Spring application context starts successfully.
    }

    @Test
    public void restTemplateBeanIsAvailable() {
        assertNotNull(restTemplate);
    }
}
