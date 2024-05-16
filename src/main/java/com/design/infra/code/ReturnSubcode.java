package com.design.infra.code;

import com.design.infra.pojo.BasePojo;

/**
 * @author Jiajing Li
 * @date 2020-08-10 15:58:16
 */
@SuppressWarnings("all")
public class ReturnSubcode extends BasePojo {

    public static final ReturnSubcode DEFAULT = new ReturnSubcode(000, "DEFAULT");
    public static final ReturnSubcode INTERNAL_ERR = new ReturnSubcode(400, "INTERNAL_ERR");
    public static final ReturnSubcode ARG_ERR = new ReturnSubcode(401, "ARG_ERR");
    public static final ReturnSubcode INIT_ERR = new ReturnSubcode(402, "INIT_ERR");
    public static final ReturnSubcode CONCURRENT_ERR = new ReturnSubcode(403, "CONCURRENT_ERR");
    public static final ReturnSubcode NOT_FOUND_ERR = new ReturnSubcode(404, "NOT_FOUND_ERR");


    private int key;

    private String value;

    public ReturnSubcode() {
    }

    public ReturnSubcode(int key, String value) {
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
