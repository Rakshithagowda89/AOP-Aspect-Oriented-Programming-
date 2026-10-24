
package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

    @Before("execution(* com.example.demo.service.EmployeeService.*(..))")
    public void beforeOperation(JoinPoint joinPoint) {

        System.out.println();
        System.out.println("[BEFORE] Starting operation: "
                + joinPoint.getSignature().getName());
    }

    @After("execution(* com.example.demo.service.EmployeeService.*(..))")
    public void afterOperation(JoinPoint joinPoint) {

        System.out.println("[AFTER] Operation completed: "
                + joinPoint.getSignature().getName());

        System.out.println("------------------------------------------------");
    }
    
    @AfterThrowing(
        pointcut = "execution(* com.example.demo.service.EmployeeService.*(..))",
        throwing = "exception"
    )
    public void afterThrowingOperation(
            JoinPoint joinPoint,
            Exception exception) {

        System.out.println("[AFTER THROWING] Operation failed!");

        System.out.println("Method: "
                + joinPoint.getSignature().getName());

        System.out.println("Reason: " + exception.getMessage());
    }
}
