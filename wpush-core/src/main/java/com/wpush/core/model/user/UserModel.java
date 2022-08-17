package com.wpush.core.model.user;

import com.wpush.core.constants.CommonConstants;
import com.wpush.core.model.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * @author fudongyi
 * @date 2022/8/17
 */
@Repository
public class UserModel {

  public static final HashMap<String, User> USER_INFO = new HashMap<>();

  static {

    USER_INFO.put(CommonConstants.JIANG_TOKEN,new User(CommonConstants.FUZHOU_CODE,"2021-03-28","2023-02-20","姜姜给洋洋的专属提醒:多喝烫水!"));

    USER_INFO.put(CommonConstants.YANG_TOKEN,new User(CommonConstants.FUZHOU_CODE,"2021-03-31","2023-02-20","姜姜给洋洋的专属提醒:多喝烫水!"));

    USER_INFO.put(CommonConstants.DONG_YI_TOKEN,new User(CommonConstants.SHANGHAI_CODE,"2021-11-14","2023-03-03","付东一给YXT的专属提醒:多喝开水!"));
  }

  public User get(String token) {
    return USER_INFO.get(token);
  }
}
