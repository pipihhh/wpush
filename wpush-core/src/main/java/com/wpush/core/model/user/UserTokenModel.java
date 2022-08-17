package com.wpush.core.model.user;

import com.wpush.core.constants.CommonConstants;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fudongyi
 * @date 2022/8/17
 */
@Repository
public class UserTokenModel {
  private static final Map<String, String> USER_MAP = new HashMap<>();

  static {
    USER_MAP.put(CommonConstants.JIANG_TOKEN, "oJP9r5g7v3_W2W5H2m4PeT5Y1T1Y");
    USER_MAP.put(CommonConstants.DONG_YI_TOKEN, "oJP9r5mJzjiTJuukXjdDZLv80eg0");
    USER_MAP.put(CommonConstants.YANG_TOKEN, "oJP9r5rDvEzvqqlOLvA0C8H7OMY8");
  }

  public String get(String userName) {
    return USER_MAP.get(userName);
  }
}
