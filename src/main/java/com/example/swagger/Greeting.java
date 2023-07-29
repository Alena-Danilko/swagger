package com.example.swagger;

import org.springframework.stereotype.Component;

@Component
public record Greeting (long id, String content) {
}
