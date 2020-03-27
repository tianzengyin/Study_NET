package com.tute.test01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author:田增印
 * @Date:2019/12/30
 * @Time:17:09
 * @Description:com.tute.test01
 * @VERSION:1.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {
    String value();
}
