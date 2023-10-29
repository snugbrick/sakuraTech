package org.m1arcleur.sakuratech.Debug;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.29 06:41
 * @website github.com/snugbrick;
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface wasNotRegister {
    String message() default "这个类没有被注册.";
}
