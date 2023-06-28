package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return """
                <h1>Nasza pierwsza wspaniała aplikacja whooooaaaa!</h1>
                <a href="/hello">Podstrona</a>
                """;
    }

    @GetMapping("/hello")
    public String hello() {
        return """
                <h1>Whooooaaaa, nasza druga strona</h1>
                <a href="/">Powrót</a>
                """;
    }

}
