package com.aitest.Ollama_ai_spring.controller;

import com.aitest.Ollama_ai_spring.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {
    @Autowired
    private AiService aiService;

    @GetMapping("/api/v6/generate")
    public String generateRateResponse(@RequestParam(value = "promptMessage") String promptMessage){
        return this.aiService.generateResponse(promptMessage);
    }

}
