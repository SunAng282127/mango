package com.louis.mango.common.utils;

/**
 * 字符工具类
 */
public class StringUtils {

    /**
     * 判空操作
     * @param value
     * @return
     */
    public static boolean isBlank(String value) {
        return value == null || "".equals(value) || "null".equals(value) || "undefined".equals(value);
    }
}