package com.github.aop.service;

import org.springframework.stereotype.Service;

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


@Service
public class AopService {

    /**
     * 两数相除
     *
     * @param a a
     * @param b b
     * @return return
     */
    public int div(int a, int b) {
        return a / b;
    }

}
