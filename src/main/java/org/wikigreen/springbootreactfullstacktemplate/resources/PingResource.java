package org.wikigreen.springbootreactfullstacktemplate.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ping")
public class PingResource {

    @GetMapping
    public String ping() {
        return "pong";
    }
}
