package com.aitest.Ollama_ai_spring.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiService {
    @Autowired
   private  OllamaChatModel ollamaChatModel;
    public String generateResponse(String prompt){
        ChatResponse chatResponse = ollamaChatModel.call(
                new Prompt( prompt,
                OllamaOptions.create()
                        .withModel("llama2")

                ));
        return chatResponse.getResult().getOutput().getContent();

    }
}
