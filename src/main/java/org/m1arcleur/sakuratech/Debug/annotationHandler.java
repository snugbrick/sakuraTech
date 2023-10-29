package org.m1arcleur.sakuratech.Debug;

import org.bukkit.Bukkit;

import java.lang.reflect.Method;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.29 06:47
 * @website github.com/snugbrick;
 */
public class annotationHandler {
    public annotationHandler(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(wasNotRegister.class)) {
                Bukkit.getLogger().info("[sakuraTech] 此类未被注册");
            }
        }
    }
}
