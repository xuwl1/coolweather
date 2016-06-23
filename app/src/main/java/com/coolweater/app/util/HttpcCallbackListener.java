package com.coolweater.app.util;

/**
 * Created by Administrator on 2016/6/17.
 */
public interface HttpcCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
