package com.github.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
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
public class Aspect4 {

    @Pointcut("@annotation(com.github.aop.annotations.PrintTime)")
    public void pointCut() {
    }

    @Around(value = "pointCut()")
    public Object logAround(ProceedingJoinPoint pdj) throws Throwable {
        System.out.println("cn.hy.aop.annotations.PrintTime");
        return pdj.proceed();
    }


}
