package com.apiobject.test;

import com.apiobject.global.ApiLoader;
import com.apiobject.steps.AssertModel;
import com.apiobject.steps.StepModel;
import com.apiobject.testcase.ApiTestCaseModel;
import org.junit.jupiter.api.BeforeAll;
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
public class Test05_ApiTestCaseTest {
    public static final Logger logger = LoggerFactory.getLogger(Test05_ApiTestCaseTest.class);
    @BeforeAll
    static void loadTest() throws IOException {
        ApiLoader.load("src/test/resources/api");
        logger.info("debugger!");
    }
    @Test
    void loadApiTest() throws IOException {
        ApiTestCaseModel apiTestCaseModel = ApiTestCaseModel.load("src/test/resources/testcase/creatdepartment.yaml");
        logger.info("Debugger!");
    }
    @Test
    void runTest() throws IOException {
        ApiTestCaseModel apiTestCaseModel = ApiTestCaseModel.load("src/test/resources/testcase/creatdepartment.yaml");
        apiTestCaseModel.run();
        logger.info("Debugger!");
    }
}
