package com.Kent.controller.utils;

import lombok.Data;

/**
 * 返回值封裝類
 */
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {}

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
