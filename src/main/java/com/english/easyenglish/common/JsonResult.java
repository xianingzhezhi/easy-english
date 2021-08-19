package com.english.easyenglish.common;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class JsonResult<T> {
    private Integer code = 200;
    private String msg = "操作成功";
    private T data;

    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(T data) {
        this.data = data;
    }

    public JsonResult(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }
}
