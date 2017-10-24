package com.lyf.cloudecode.interfaces;

import com.google.zxing.Result;

/**
 * @author lyf
 * @date 2017/10/23/023
 * 扫描二维码回调
 */

public interface OnScanerListener {
    /**
     * 扫描二维码成功回调
     *
     * @param type
     * @param result
     */
    void onSuccess(String type, Result result);

    /**
     * 扫描二维码失败回调
     *
     * @param type
     * @param message
     */
    void onFail(String type, String message);
}
