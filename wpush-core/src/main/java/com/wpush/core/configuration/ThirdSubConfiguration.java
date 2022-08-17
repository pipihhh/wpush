package com.wpush.core.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fudongyi
 * @date 2022/8/5
 */
@Data
@ConfigurationProperties("third.sub")
public class ThirdSubConfiguration {
  public String appId;
  public String secret;
  public String templateId;
}
