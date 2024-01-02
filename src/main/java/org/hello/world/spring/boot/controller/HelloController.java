package org.hello.world.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class HelloController {

    @GetMapping
    public Collection<String> SayHello(){
        return IntStream.range(0, 10)
                .mapToObj(i -> "Spring Boot Hello World! " + i)
                .collect(Collectors.toList());
    }
}
