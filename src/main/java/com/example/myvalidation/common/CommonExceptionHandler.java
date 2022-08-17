package com.example.myvalidation.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 陈添明
 */
@RestControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    /*@ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Result handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        StringBuilder sb = new StringBuilder("校验失败:");
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            sb.append(fieldError.getField()).append("：").append(fieldError.getDefaultMessage()).append(", ");
        }
        String msg = sb.toString();
        return Result.fail(BusinessCode.参数校验失败, msg);
    }

    @ExceptionHandler({ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Result handleConstraintViolationException(ConstraintViolationException ex) {
        return Result.fail(BusinessCode.参数校验失败, ex.getMessage());
    }

    @ExceptionHandler({NotReadablePropertyException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Result handleNotReadablePropertyException(NotReadablePropertyException ex) {
        return Result.fail(BusinessCode.参数校验失败, ex.getMessage());
    }


    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Result handleException(Exception ex) {
        log.error("未知系统错误", ex);
        return Result.fail(BusinessCode.未知系统错误, ex.getMessage());
    }*/

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public void handleException(Exception e) {
        e.printStackTrace();
    }
}
