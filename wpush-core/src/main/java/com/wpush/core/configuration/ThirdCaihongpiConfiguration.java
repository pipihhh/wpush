package com.wpush.core.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fudongyi
 * @date 2022/8/5
 */
@Data
@ConfigurationProperties("third.caihongpi")
public class ThirdCaihongpiConfiguration {
  public String key = "c0f5c0ccde40207b31d78fe18f536443";
  public String url = "http://api.tianapi.com/caihongpi/index?key=";
  public String name = "宝宝";
  public String defaultContent;
}
