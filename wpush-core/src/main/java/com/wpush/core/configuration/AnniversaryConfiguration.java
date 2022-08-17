package com.wpush.core.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author fudongyi
 * @date 2022/8/5
 */
@Data
@ConfigurationProperties("anniversary")
public class AnniversaryConfiguration {
  public String lingzheng;
  public String jiehun;
  public String shengri;
  public String lianai;
}
