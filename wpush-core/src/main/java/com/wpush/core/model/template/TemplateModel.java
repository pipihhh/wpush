package com.wpush.core.model.template;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fudongyi
 * @date 2022/8/17
 */
@Repository
public class TemplateModel {
  private static final Map<String, String> TEMPLATE_MAP = new HashMap<>();

  static {
    //有恋爱
    TEMPLATE_MAP.put("t1", "QqL34o6OqvXadj2J4IBWZApgIuDVm1GjCIBfb8CFfs8");
    //没恋爱
    TEMPLATE_MAP.put("t2", "2ReiGHTuv6mBthHvLi7HlQOxGm8VJccaC_zxN3d1thc");
    //咪仔不打辅助
    TEMPLATE_MAP.put("t3", "hePYZD_ON9o-96W8iIAMYegYCY48W3t2-elsIEarEnw");
  }

  public String getByTemplateId(String id) {
    return TEMPLATE_MAP.get(id);
  }
}
