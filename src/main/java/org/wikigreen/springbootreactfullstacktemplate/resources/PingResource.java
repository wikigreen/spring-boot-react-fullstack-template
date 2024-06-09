package org.wikigreen.springbootreactfullstacktemplate.resources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ping")
@Slf4j
public class PingResource {

    @GetMapping
    public String ping() {
        return "pong";
    }
}
