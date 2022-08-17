package com.wpush.scheduler.task;

import com.alibaba.fastjson.JSON;
import com.wpush.core.service.push.PushService;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @ClassName JobWorker
 * @Description TODO
 * @Author ydzhao
 * @Date 2022/8/2 16:00
 */
@Component
@Slf4j
public class PushTask {

    @Resource
    private PushService pushService;

    @XxlJob(value = "wechatPushJob")
    public void goodMorning() {
        Param param = JSON.parseObject(XxlJobHelper.getJobParam(), Param.class);
        if (Objects.isNull(param)) {
            XxlJobHelper.handleFail("Param is null.");
        }

        XxlJobHelper.log("开始task, Param:{}", XxlJobHelper.getJobParam());
        pushService.push(param.userToken, param.template);
    }

    public static class Param {
        public String userToken;
        public String template;
    }
}
