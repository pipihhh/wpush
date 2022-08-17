package com.wpush.core.constants;

import java.util.HashMap;

/**
 * @author fudongyi
 * @date 2022/8/17
 */
public class CommonConstants {
  /**
   * 姜姜Token
   */
  public static final String JIANG_TOKEN = "jiangjiang";

  /**
   * 东一Token
   */
  public static final String DONG_YI_TOKEN = "dongyi";


  /**
   * 洋洋Token
   */
  public static final String YANG_TOKEN = "yangyang";

  /**
   * 用户Map
   */
  public static final HashMap<String, String> USER_MAP = new HashMap<>();

  /**
   * 模版Map
   */
  public static final HashMap<String, String> TEMPLATE_MAP = new HashMap<>();

  /**
   * 上海静安地区编码
   */
  public static final String SHANGHAI_CODE = "110105";

  /**
   * 福建鼓楼区编码
   */
  public static final String FUZHOU_CODE = "350102";

  static {
    USER_MAP.put(JIANG_TOKEN, "oJP9r5g7v3_W2W5H2m4PeT5Y1T1Y");
    USER_MAP.put(DONG_YI_TOKEN, "oJP9r5mJzjiTJuukXjdDZLv80eg0");
    USER_MAP.put(YANG_TOKEN, "oJP9r5rDvEzvqqlOLvA0C8H7OMY8");


    //有恋爱
    TEMPLATE_MAP.put("t1", "QqL34o6OqvXadj2J4IBWZApgIuDVm1GjCIBfb8CFfs8");
    //没恋爱
    TEMPLATE_MAP.put("t2", "2ReiGHTuv6mBthHvLi7HlQOxGm8VJccaC_zxN3d1thc");
    //咪仔不打辅助
    TEMPLATE_MAP.put("t3", "hePYZD_ON9o-96W8iIAMYegYCY48W3t2-elsIEarEnw");
  }
}
