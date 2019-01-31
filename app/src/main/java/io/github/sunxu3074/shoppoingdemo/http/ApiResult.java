package io.github.sunxu3074.shoppoingdemo.http;

public class ApiResult<T> {

    public static final int SUCCESS_CODE = 1;

    private int code;
    private T data;
    private String msg;

    public ApiResult() {
    }

    public ApiResult(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public ApiResult(String msg) {
        this(SUCCESS_CODE,null,msg);
    }

    public ApiResult(String msg, T data) {
        this(SUCCESS_CODE,data,msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public boolean isOk(){
        return code==SUCCESS_CODE;
    }


    public static boolean isSuccess(int code){
        return code == SUCCESS_CODE;
    }

}
