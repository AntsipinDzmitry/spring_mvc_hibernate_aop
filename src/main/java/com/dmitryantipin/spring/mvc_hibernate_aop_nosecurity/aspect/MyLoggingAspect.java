package com.dmitryantipin.spring.mvc_hibernate_aop_nosecurity.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

//We can implement the AOP logic in this class, the current advice is only used as an example.
//        Separate business logic from auxiliary logic using this approach

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.dmitryantipin.spring.mvc_hibernate_aop_nosecurity.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = signature.getName();

        System.out.println("Begin of " + methodName);

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("End of " + methodName);

        return targetMethodResult;
    }
}
