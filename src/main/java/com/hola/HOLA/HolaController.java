package com.hola.HOLA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String index() {
        int result = calculateSum(10, 20);
        int resultdd = idoKnowWhatImDoing(10,20);
        System.out.println("Result: " + result);
        return String.format("Greetings from Spring Boot! Result is %d", result);

    }

    private static int calculateSum(int a, int b) {
        // Redundant variables and unnecessary operations
        int x = a;
        int y = b;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + x + y;
            // Unnecessary conditional statement
            if (i % 2 == 0) {
                // Unused variable
                int temp = x;
                x = y;
                y = temp;
            }
        }

        // Return inside the loop
        return sum;
    }

    private static int idoKnowWhatImDoing(int a, int b) {
        // Redundant variables and unnecessary operations
        int x = a;
        int y = b;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + x + y;
            // Unnecessary conditional statement
            if (i % 2 == 0) {
                // Unused variable
                int temp = x;
                x = y;
                y = temp;
            }
        }

        // Return inside the loop
        return sum;
    }

}