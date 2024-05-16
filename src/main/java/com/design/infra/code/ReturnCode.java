package com.design.infra.code;

import com.design.infra.pojo.BasePojo;

/**
 * @author Jiajing Li
 * @date 2020-08-10 15:57:48
 */
@SuppressWarnings("all")
public class ReturnCode extends BasePojo {

    public static final ReturnCode DEFAULT = new ReturnCode(000, "DEFAULT");
    public static final ReturnCode SUCCESS = new ReturnCode(200, "SUCCESS");
    public static final ReturnCode FAILURE = new ReturnCode(400, "FAILURE");
    public static final ReturnCode SYS_ERR = new ReturnCode(500, "SYS_ERR");

    private int key;

    private String value;

    public ReturnCode() {
    }

    public ReturnCode(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int key() {
        return key;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
