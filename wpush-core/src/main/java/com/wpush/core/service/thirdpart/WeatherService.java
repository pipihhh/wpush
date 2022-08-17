package com.wpush.core.service.thirdpart;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wpush.core.configuration.ThirdBaiduConfiguration;
import com.wpush.core.model.user.UserModel;
import com.wpush.core.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * @ClassName Tianqi
 * @Description TODO
 * @Author ydzhao
 * @Date 2022/8/2 16:45
 */
@Component
public class WeatherService {
    private static String ak = "xxx";

    @Autowired
    private ThirdBaiduConfiguration thirdBaiduConfiguration;
    @Autowired
    private UserModel userModel;

    @PostConstruct
    private void init() {
        ak = thirdBaiduConfiguration.ak;
    }

    public JSONObject getNanjiTianqi(String userToken) {
        String result = null;
        JSONObject today = new JSONObject();
        try {
            result = HttpUtil.getUrl("https://api.map.baidu.com/weather/v1/?district_id=" + userModel.get(userToken).getCityCode() + "&data_type=all&ak=" + ak);
            JSONObject jsonObject = JSONObject.parseObject(result);
            if (jsonObject.getString("message").equals("success")) {
                JSONArray arr = jsonObject.getJSONObject("result").getJSONArray("forecasts");
                today = arr.getJSONObject(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return today;
    }

}
