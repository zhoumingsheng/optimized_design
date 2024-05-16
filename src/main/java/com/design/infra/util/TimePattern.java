package com.design.infra.util;


@SuppressWarnings("all")
public enum TimePattern {

    /**
     * time pattern
     */
    YY("yy"),
    YYMM("yyMM"),
    YYYY("yyyy"),
    YYYYMM("yyyyMM"),
    YYYYMMDD("yyyyMMdd"),
    YYYYMMDDHH("yyyyMMddHH"),
    HH_MM("HH:mm"),
    HH_MM_SS("HH:mm:ss"),
    HH_MM_SS_FFF("HH:mm:ss.SSS"),
    HH_MM_SS_FFFFFF("HH:mm:ss.SSSSSS"),
    HH_MM_SS_FFFFFFFFF("HH:mm:ss.SSSSSSSSS"),

    MM_DD("MM-dd"),
    YYYY_MM("yyyy-MM"),
    YYYY_MM_DD("yyyy-MM-dd"),
    MM_DD_HH_MM("MM-dd HH:mm"),
    MM_DD_HH_MM_SS("MM-dd HH:mm:ss"),
    YYYY_MM_DD_HH_MM("yyyy-MM-dd HH:mm"),
    YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss"),
    YYYY_MM_DD_HH_MM_SS_FFF("yyyy-MM-dd HH:mm:ss.SSS"),
    YYYY_MM_DD_HH_MM_SS_FFFFFF("yyyy-MM-dd HH:mm:ss.SSSSSS"),
    YYYY_MM_DD_HH_MM_SS_FFFFFFFFF("yyyy-MM-dd HH:mm:ss.SSSSSSSSS"),

    YYYYMMDDHHMM("yyyyMMddHHmm"),
    YYYYMMDDHHMMSS("yyyyMMddHHmmss"),

    ;

    private String value;

    TimePattern(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
