package com.wp.dealfile.api;

/**
 * 枚举了一些常用API操作码
 * Created by wpeng on 2019/8/19.
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(0000, "操作成功"),
    FAILED(9999, "操作失败");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
