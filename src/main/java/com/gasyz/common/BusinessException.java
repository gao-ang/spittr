package com.gasyz.common;

/**
 * Created by gaoang on 2018/2/27.
 */
public class BusinessException extends RuntimeException {
    protected String code;
    private String message;
    private String outerMsg;
    private String moreMsg;
    private static final long serialVersionUID = -2029130477461261042L;

    public BusinessException(String code, String outerMsg, String moreMsg, Throwable cause) {
        super(outerMsg + " " + moreMsg, cause);
        this.message = outerMsg + " " + moreMsg;
        this.outerMsg = outerMsg;
        this.moreMsg = moreMsg;
        this.code = code;
    }

    public BusinessException(String code, String outerMsg, String moreMsg) {
        super(outerMsg + " " + moreMsg);
        this.message = outerMsg + " " + moreMsg;
        this.outerMsg = outerMsg;
        this.moreMsg = moreMsg;
        this.code = code;
    }

    public BusinessException(String code, String message, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.outerMsg = message;
        this.code = code;
    }

    public BusinessException(String code, String message) {
        super(message);
        this.message = message;
        this.outerMsg = message;
        this.code = code;
    }

    public String getLocalizedMessage() {
        return this.message;
    }

    public String getCode() {
        return this.code;
    }

    public String getOuterMsg() {
        return this.outerMsg;
    }

    public String getMoreMsg() {
        return this.moreMsg;
    }
}
