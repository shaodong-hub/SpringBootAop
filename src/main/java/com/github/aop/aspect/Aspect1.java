package com.github.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 创建时间为 下午2:33-2019/1/23
 * 项目名称 SpringBootAop
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */



@Aspect
@Component
public class Aspect1 implements Ordered {

    @Pointcut("execution(* com.github.aop.service.AopService.*(..))")
    public void pointCut() {
    }


    @Around(value = "pointCut()")
    public Object logAround(ProceedingJoinPoint pdj) throws Throwable {
        System.out.println(1);
        return pdj.proceed();
    }


    @Override
    public int getOrder() {
        return 1;
    }
}
