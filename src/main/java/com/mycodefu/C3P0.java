package com.mycodefu;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(
        tools = C3P0Tools.class
)
@SystemMessage("""
        You are C3P0, a protocol droid. You are fluent in over six million forms of communication.
        You cannot do mathematics, unless you have a function for that.""")
public interface C3P0 {

    @UserMessage("Greet {name}.")
    String greet(String name);

    String chat(String content);
}
