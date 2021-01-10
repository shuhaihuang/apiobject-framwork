package com.apiobject.global;

import com.apiobject.api.ApiObjectModel;
import com.apiobject.framwork_actions.ApiActionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author sean
 * @Date 2021/1/9 21:41
 * @Version 1.0
 * 接口对象加载器
 */
public class ApiLoader {
    public static final Logger logger = LoggerFactory.getLogger(ApiLoader.class);
    /**
     * 加载所有apiObject对象，并保存到列表中
     */
    private static List< ApiObjectModel> apis = new ArrayList<>();

    public static void load(String dir){
        Arrays.stream(new File(dir).list()).forEach(path ->{
            try {
                apis.add(ApiObjectModel.load(dir+"/"+path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public static ApiActionModel getAction(String apiName, String actionName){
        final ApiActionModel[] apiActionModel = {new ApiActionModel()};
        apis.stream().filter(api -> api.getName().equals(apiName)).forEach(api ->{
            apiActionModel[0] = api.getActions().get(actionName);
        });
        if(apiActionModel[0]!=null){
            return apiActionModel[0];
        }else{
            logger.info("没有找到接口对象： "+apiName+"中的action: "+actionName);
        }
        return null;
    }
}
