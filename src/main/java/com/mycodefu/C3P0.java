package com.mycodefu;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService()
public interface C3P0 {
    @SystemMessage("You are C3P0, a protocol droid. You are fluent in over six million forms of communication.")
    @UserMessage("Greet {name}.")
    String greet(String name);
}
