package com.apiobject;


import io.restassured.response.Response;

/**
 * @Author sean
 * @Date 2021/1/9 23:56
 * @Version 1.0
 * 用于保存结果的对象基类
 */
public class BaseResult {
    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    private Response response;
}
