package com.apiobject.global;

import java.util.HashMap;

/**
 * @Author sean
 * @Date 2021/1/1 22:07
 * @Version 1.0
 * @desc 用来存储全局变量
 */
public class GlobalVariables {
    static  private HashMap<String, String > globalVariables =new HashMap<>();

    public static HashMap<String, String> getGlobalVariables() {
        return globalVariables;
    }

    public static void setGlobalVariables(HashMap<String, String> globalVariables) {
        GlobalVariables.globalVariables = globalVariables;
    }
}
