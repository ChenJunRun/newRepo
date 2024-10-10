package com.deepblue;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class MyJsonService {

    // 前缀
    private String prefixName;
    // 后缀
    private String suffixName;



    public String objectToMyJson(Object o) {
        return prefixName + JSON.toJSONString(o) + suffixName;
    }


}
