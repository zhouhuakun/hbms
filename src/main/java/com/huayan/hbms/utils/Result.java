package com.huayan.hbms.utils;

import lombok.Data;

@Data
public class Result<T>{
    private int status;
    private String msg;
    private T data;

    public static Result success(Object obj){
        Result<Object> result = new Result<>();
        result.setStatus(Constants.SUCCESS_STATUS_200);
        result.setMsg(Constants.SUCCESS_MSG);
        result.setData(obj);
        return result;
    }
    public static Result error(Object obj){
        Result<Object> result = new Result<>();
        result.setStatus(Constants.ERROR_STATUS_404);
        result.setMsg(Constants.ERROR_MSG);
        result.setData(obj);
        return result;

}



}
