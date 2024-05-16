package com.design.infra.helper;


import com.design.infra.constant.CommonConstants;
import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;


@SuppressWarnings("all")
public class StringHelpers {

    private StringHelpers() {}

    public static boolean isEmpty(CharSequence cs) {
        return StringUtils.isEmpty(cs);
    }

    public static boolean nonEmpty(CharSequence cs) {
        return !isEmpty(cs);
    }

    public static boolean isBlank(CharSequence cs) {
        return StringUtils.isBlank(cs);
    }

    public static boolean nonBlank(CharSequence cs) {
        return !isBlank(cs);
    }

    public static String getSelfOrEmpty(String str) {
        return nonEmpty(str) ? str : CommonConstants.EMPTY;
    }

    public static String defaultIfEmpty(String str, String defaultValue) {
        return nonEmpty(str) ? str : defaultValue;
    }

    public static String getNullIfEmpty(String str) {
        return isEmpty(str) ? null : str;
    }

    public static boolean isAnyEmpty(CharSequence... css) {
        return StringUtils.isAnyEmpty(css);
    }

    public static boolean isNoneEmpty(CharSequence... css) {
        return StringUtils.isNoneEmpty(css);
    }

    

    public static boolean isAnyBlank(CharSequence... css) {
        return StringUtils.isAnyBlank(css);
    }

    public static boolean isNoneBlank(CharSequence... css) {
        return StringUtils.isNoneBlank(css);
    }


    public static boolean isDigit(String str) {
        try {
            new BigDecimal(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean nonDigit(String str) {
        return !isDigit(str);
    }

    public static boolean isEqual(String first, String second) {
        return StringUtils.equals(first, second);
    }

    public static boolean nonEqual(String first, String second) {
        return !isEqual(first, second);
    }

    public static boolean isEqualIgnoreCase(String first, String second) {
        return StringUtils.equalsIgnoreCase(first, second);
    }

    public static boolean nonEqualIgnoreCase(String first, String second) {
        return !isEqualIgnoreCase(first, second);
    }

    

}
