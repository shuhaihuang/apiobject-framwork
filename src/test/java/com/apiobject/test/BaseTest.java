package com.apiobject.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * @Author sean
 * @Date 2021/1/1 21:28
 * @Version 1.0
 */
public class BaseTest {
    @Test
    void run() {
        String accessToken=given()
                .log().all()
                .when()
                .param("corpid","ww3d52506992467125")
                .param("corpsecret","UKp_qRLzieLoqJKfbOaGwSvD4sv0TevgLoW6mHaV-lM")
                .get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then()
                .log().body()
                .extract()
                .response()
                .path("access_token");
        System.out.println(accessToken);
    }

    @Test
    void subStr() {
        HashMap<String ,String> timstamp = new HashMap<>();
        timstamp.put("getTimeStamp", "1");
        timstamp.put("getTimeStamp", "2");
        timstamp.put("getTimeStamp", "3");
    }
    @Test
    void assertTest() {
        assertAll("",
                ()->{assertThat(1,equalTo(2));},
                ()->{assertThat(1,equalTo(3));},
                ()->{assertThat(1,equalTo(4));}
        );
    }
    @Test
    void assertTest2() {
        ArrayList<Executable> assertList = new ArrayList<Executable>();

        assertList.add(()->{assertThat(1,equalTo(2));});
        assertList.add(()->{assertThat(1,equalTo(3));});
        assertList.add(()->{assertThat("",1,equalTo(4));});
        assertAll("", assertList.stream());
    }
}
