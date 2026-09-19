package com.yourname;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @RequestMapping(value = "/api/ping", method = RequestMethod.GET,
            produces = MediaType.TEXT_PLAIN_VALUE)
    public String ping() {
        return "pong";
    }
}
