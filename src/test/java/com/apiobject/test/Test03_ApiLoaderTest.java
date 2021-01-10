package com.apiobject.test;

import com.apiobject.api.ApiObjectModel;
import com.apiobject.global.ApiLoader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author sean
 * @Date 2021/1/9 19:56
 * @Version 1.0
 * 对apiObject对象实现的单元测试
 */
public class Test03_ApiLoaderTest {
    public static final Logger logger = LoggerFactory.getLogger(Test03_ApiLoaderTest.class);
    @BeforeAll
    static void loadTest() throws IOException {
        ApiLoader.load("src/test/resources/api");
        logger.info("debugger!");
    }
    @Test
    void getActionTest()  {
        ArrayList<String> actualParameter = new ArrayList<>();
        actualParameter.add("ww3d52506992467125");
        actualParameter.add("UKp_qRLzieLoqJKfbOaGwSvD4sv0TevgLoW6mHaV-lM");
        ApiLoader.getAction("tokenhelper","getToken").run(actualParameter);
    }
}
