package com.louis.mango.common.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * IO相关工具类
 */
public class IOUtils {

    /**
     * 关闭对象连接
     * @param closeable
     */
    public static void closeQuietly(final Closeable closeable){
        try {
            if(closeable!=null){
                closeable.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
