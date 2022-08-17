package com.wpush.core.service.thirdpart;

import com.alibaba.fastjson.JSONObject;
import com.wpush.core.configuration.ThirdCaihongpiConfiguration;
import com.wpush.core.utils.HttpUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * @ClassName CaiHongPi
 * @Description TODO
 * @Author ydzhao
 * @Date 2022/8/2 17:26
 */
@Component
public class CaiHongPiService {
    private static String key = "xxx";
    private static String url = "http://api.tianapi.com/caihongpi/index?key=";
    private static List<String> jinJuList = new ArrayList<>();
    private static String name = "老婆";
    private static String defaultContent;

    @Autowired
    private ThirdCaihongpiConfiguration thirdCaihongpiConfiguration;

    @PostConstruct
    public void init() {
        key = thirdCaihongpiConfiguration.key;
        url = thirdCaihongpiConfiguration.url;
        name = thirdCaihongpiConfiguration.name;
        defaultContent = thirdCaihongpiConfiguration.defaultContent;
    }

    public String getCaiHongPi() {
        //默认彩虹屁
        String str = defaultContent;
        try {
            JSONObject jsonObject = JSONObject.parseObject(HttpUtil.getUrl(url+key).replace("XXX", name));
            if (jsonObject.getIntValue("code") == 200) {
                str = jsonObject.getJSONArray("newslist").getJSONObject(0).getString("content");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 载入金句库
     */
    static {
        InputStream inputStream = CaiHongPiService.class.getClassLoader().getResourceAsStream("jinju.txt");
        if (Objects.isNull(inputStream)) {
            throw new RuntimeException("未找到jinju.txt，无法启动服务!");
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String str = "";
            String temp = "";
            while ((temp = br.readLine()) != null) {
                if (!StringUtils.isEmpty(temp)) {
                    str = str + "\r\n" + temp;
                } else {
                    jinJuList.add(str);
                    str = "";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getJinJu() {
        Random random = new Random();
        return jinJuList.get(random.nextInt(jinJuList.size()));
    }
}
