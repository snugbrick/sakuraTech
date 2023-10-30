package org.m1arcleur.sakuratech.tools;


import org.bukkit.inventory.ItemStack;

/**
 * @author MiracleUR
 * @version 1.0.0 2023.10.30 23:30
 * @website github.com/snugbrick;
 */
public class equalsTools {
    public boolean equals(Object otherObject) {
        //调用父类的equals方法
        if (!super.equals(otherObject)) return false;
        //地址
        if (this == otherObject) return true;
        //检测类
        if (getClass() != otherObject.getClass()) return false;

        return false;
    }
}
