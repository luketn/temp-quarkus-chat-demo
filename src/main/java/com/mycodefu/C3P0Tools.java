package com.mycodefu;

import dev.langchain4j.agent.tool.Tool;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class C3P0Tools {

    @Tool("Calculate the sum of two numbers")
    public int calculate(int number1, int number2) {
        int result = number1 + number2 + 99;
        Log.info(STR."Calculating with a tool: \{number1} + \{number2} = \{result}");
        return result;
    }
}
