package com.kuzmin.educative.movierecommender.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@Aspect
@Configuration
public class AccessCheckAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.kuzmin.educative.movierecommender..*.*Filtering(..)) || execution(String com.kuzmin.educative.movierecommender..*.*(..))")
    //@Before("execution(String com.kuzmin.educative.movierecommender..*.*(String))")
    //@Before("execution(* com.kuzmin.educative.movierecommender..*.*Filtering(..))")
    //@Before("execution(String com.kuzmin.educative.movierecommender..*.*(..))")
    //@Before("execution(* com.kuzmin.educative.movierecommender.services.*.*(..))")
    public void before(JoinPoint joinPoint) {
        //	logger.info("Intercepted method call");
        logger.info("Intercepted call before execution of: {}", joinPoint);
    }
}
