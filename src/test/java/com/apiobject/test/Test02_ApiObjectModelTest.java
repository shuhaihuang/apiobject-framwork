package com.apiobject.test;

import com.apiobject.api.ApiObjectModel;
import com.apiobject.framwork_actions.ApiActionModel;
import com.apiobject.global.GlobalVariables;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author sean
 * @Date 2021/1/9 19:56
 * @Version 1.0
 * 对apiObject对象实现的单元测试
 */
public class Test02_ApiObjectModelTest {
    public static final Logger logger = LoggerFactory.getLogger(Test02_ApiObjectModelTest.class);
    @Test
    void loadTest() throws IOException {
        ArrayList<String> actualParameter = new ArrayList<>();
        actualParameter.add("ww3d52506992467125");
        actualParameter.add("UKp_qRLzieLoqJKfbOaGwSvD4sv0TevgLoW6mHaV-lM");

        ApiObjectModel apiObjectModel = ApiObjectModel.load("src/test/resources/api/tokenhelper.yaml");
        apiObjectModel.getActions().get("getToken").run(actualParameter);
    }
}
