package com.yourname;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @RequestMapping(value = "/api/echo", method = RequestMethod.GET)
    public Map<String, String> echo(@RequestParam String message) {
        return Collections.singletonMap("message", message);
    }
}
