/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;
import java.util.Scanner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
/**
 *
 * @author zaihd
 */
public class TestSubraction 
{
    int choice, num1, num2, answer;

        System.out.println("\tCalculator");
        System.out.println("1: Minus");
        System.out.println("2: Exit");

        System.out.println("Enter first number");
        num1 = scn.nextInt();
        System.out.println("Enter second number");
        num2 = scn.nextInt();
        System.out.println("Enter your choice");

        choice = scn.nextInt();

        switch (choice) {
            case 1:
                answer = num1 - num2;
                System.out.println("Subtraction: " + answer);
                break;
            case 5:
                System.out.println("Thank you.");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice");
        }
        System.out.println("Switch done.");
       
        
        if (num1==num2)
        {
            System.out.println("Object is equal");
        }

        //timeout
        final Duration timeout = Duration.ofSeconds(30);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        final Future<String> handler = executor.submit(new Callable() 
        {
            @Override
            public String call() throws Exception 
                {
                return requestDataFromModem();
                }
        });

        try {
            handler.get(timeout.toMillis(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) 
            {
                handler.cancel(true);
            }

        executor.shutdownNow();
                
                
        //disable        
        public class DisabledTestMethod 
        {

            @Disabled("Disabled")
            @Test
            
            void testCustomerServiceGet() 
                {
                assertEquals(2, 1 + 1);
                }

            @Test
            void test3Plus3() 
                {
                assertEquals(6, 3 + 3);
                }        
        }
 
        

        
        
        
}




        
        
        
        

