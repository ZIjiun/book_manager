package com.Kent.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// springMVC 的異常處理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public R doException(Exception ex){
        ex.printStackTrace();
        return new R("伺服器故障，請稍後再試");
    }
}
