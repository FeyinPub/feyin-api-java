package com.feyin.api;

/**
 * apiV2调用返回状态类
 * Created by Think on 2017/11/17.
 */
public class FeyinResponse {

    private boolean success;    //请求处理状态，true为成功，false为失败
    private String errMsg;  //错误信息代码，success为true时为空字符串

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "FeyinResponse(success=" + this.success + ", errMsg=" + this.errMsg + ")";
    }
}
