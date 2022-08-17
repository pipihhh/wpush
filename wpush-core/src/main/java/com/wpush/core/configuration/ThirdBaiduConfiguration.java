package com.wpush.core.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fudongyi
 * @date 2022/8/5
 */
@Data
@ConfigurationProperties("third.baidu")
public class ThirdBaiduConfiguration {
  public String ak;
  public String districtId;
}
