package com.github.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 创建时间为 下午2:34-2019/1/23
 * 项目名称 SpringBootAop
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Aspect
@Component
public class Aspect3 implements Ordered {

    @Pointcut("execution(* com.github.aop.service.AopService.*(..))")
    public void pointCut() {
    }

    @Around(value = "pointCut()")
    public Object logAround(ProceedingJoinPoint pdj) throws Throwable {
        System.out.println(3);

        System.out.println("getName:" + pdj.getSignature().getName());
        System.out.println("getDeclaringTypeName:" + pdj.getSignature().getDeclaringTypeName());
        System.out.println("getDeclaringType:" + pdj.getSignature().getDeclaringType().getName());
        System.out.println("toShortString:" + pdj.getSignature().toShortString());
        System.out.println("toLongString:" + pdj.getSignature().toLongString());
        System.out.println("toString:" + pdj.getTarget().toString().getClass().getName());
        return pdj.proceed();
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
