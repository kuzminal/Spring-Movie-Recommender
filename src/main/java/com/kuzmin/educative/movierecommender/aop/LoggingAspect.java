package com.kuzmin.educative.movierecommender.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
@Configuration
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "execution(* com.kuzmin.educative.movierecommender.services.*.*(..))",
            returning = "result")
    public void LogAfterExecution(JoinPoint joinPoint, Object result) {
        logger.info("Method {} returned with: {}", joinPoint, result);
    }

    @AfterThrowing(
            value = "execution(* com.kuzmin.educative.movierecommender.services.*.*(..))",
            throwing = "exception")
    public void LogAfterException(JoinPoint joinPoint, Throwable exception) {
        logger.info("Method {} returned with: {}", joinPoint, exception);
    }

    @After("execution(* com.kuzmin.educative.movierecommender.services.*.*(..))")
    public void LogAfterMethod(JoinPoint joinPoint) {
        logger.info("After method call {}", joinPoint);
    }
}
