package com.kuzmin.educative.movierecommender.aop;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {
    @Pointcut("execution(* com.kuzmin.educative.movierecommender.repository.*.*(..))")
    public void dataLayerPointcut() {}

    @Pointcut("execution(* com.kuzmin.educative.movierecommender.services.*.*(..))")
    public void businessLayerPointcut() {}

    //to intercept method calls for both layers:
    @Pointcut("com.kuzmin.educative.movierecommender.aop.JoinPointConfig.dataLayerPointcut() || "
            + "com.kuzmin.educative.movierecommender.aop.JoinPointConfig.businessLayerPointcut()")
    public void allLayersPointcut() {}

    //for a particular bean
    @Pointcut("bean(movie*)")
    public void movieBeanPointcut() {}

    //custom aspect annotation
    @Pointcut("@annotation(com.kuzmin.educative.movierecommender.aop.MeasureTime)")
    public void measureTimeAnnotation() {}
}
