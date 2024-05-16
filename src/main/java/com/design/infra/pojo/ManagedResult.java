package com.design.infra.pojo;


import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.design.infra.code.ReturnCode;
import com.design.infra.code.ReturnSubcode;

import lombok.Getter;
import lombok.Setter;


@SuppressWarnings("all")
@Getter
@Setter
public class ManagedResult extends BasePojo {
    /**
     * return code
     */
    private ReturnCode code = ReturnCode.DEFAULT;
    /**
     * return subcode
     */
    private ReturnSubcode subcode = ReturnSubcode.DEFAULT;
    /**
     * actual result
     */
    private Object object = new Object();
    /**
     * summary info
     */
    private String msg = StringUtils.EMPTY;

    private String msgSharkKey = StringUtils.EMPTY;
    /**
     * detail info
     */
    private String cause = StringUtils.EMPTY;
    /**
     * break or not when in a loop
     */
    private boolean interrupted = false;
    /**
     * exception
     *
     * for internal usage, do not depend on it
     */
    private Exception exception = null;

    public static ManagedResult getSuccessResult() {
        return new ManagedResult(ReturnCode.SUCCESS);
    }

    public static ManagedResult getSuccessResult(Object object) {
        return new ManagedResult(ReturnCode.SUCCESS, object);
    }

    public static ManagedResult getSuccessResult(String msg) {
        return new ManagedResult(ReturnCode.SUCCESS, msg);
    }

    public static ManagedResult getSuccessResult(Object object, String msg) {
        return new ManagedResult(ReturnCode.SUCCESS, object, msg);
    }

    public static ManagedResult getSuccessResult(String msg, String cause) {
        return new ManagedResult(ReturnCode.SUCCESS, msg, cause);
    }

    public static ManagedResult getFailureResult() {
        return new ManagedResult(ReturnCode.FAILURE);
    }

    public static ManagedResult getFailureResult(Object object) {
        return new ManagedResult(ReturnCode.FAILURE, object);
    }

    public static ManagedResult getFailureResult(String msg) {
        return new ManagedResult(ReturnCode.FAILURE, msg);
    }

    public static ManagedResult getFailureResult(Object object, String msg) {
        return new ManagedResult(ReturnCode.FAILURE, object, msg);
    }

    public static ManagedResult getFailureResult(String msg, String cause) {
        return new ManagedResult(ReturnCode.FAILURE, msg, cause);
    }

    public static ManagedResult getFailureResult(ReturnSubcode subcode) {
        return new ManagedResult(ReturnCode.FAILURE, subcode);
    }

    public static ManagedResult getFailureResult(ReturnSubcode subcode, Object object) {
        return new ManagedResult(ReturnCode.FAILURE, subcode, object);
    }

    public static ManagedResult getFailureResult(ReturnSubcode subcode, String msg) {
        return new ManagedResult(ReturnCode.FAILURE, subcode, msg);
    }

    public static ManagedResult getFailureResult(ReturnSubcode subcode, Object object, String msg) {
        return new ManagedResult(ReturnCode.FAILURE, subcode, object, msg);
    }

    public static ManagedResult getFailureResult(ReturnSubcode subcode, String msg, String cause) {
        return new ManagedResult(ReturnCode.FAILURE, subcode, msg, cause);
    }

    public static ManagedResult getInterruptResult(ReturnCode code) {
        return new ManagedResult(code, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, Object object) {
        return new ManagedResult(code, object, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, String msg) {
        return new ManagedResult(code, msg, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, Object object, String msg) {
        return new ManagedResult(code, object, msg, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, String msg, String cause) {
        return new ManagedResult(code, msg, cause, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, ReturnSubcode subcode) {
        return new ManagedResult(code, subcode, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, ReturnSubcode subcode, Object object) {
        return new ManagedResult(code, subcode, object, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, ReturnSubcode subcode, String msg) {
        return new ManagedResult(code, subcode, msg, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, ReturnSubcode subcode, Object object, String msg) {
        return new ManagedResult(code, subcode, object, msg, true);
    }

    public static ManagedResult getInterruptResult(ReturnCode code, ReturnSubcode subcode, String msg, String cause) {
        return new ManagedResult(code, subcode, msg, cause, true);
    }

    public static ManagedResult getResult(ReturnCode code, Object object) {
        return new ManagedResult(code, object);
    }

    public static ManagedResult getResult(ReturnCode code, String msg) {
        return new ManagedResult(code, msg);
    }

    public static ManagedResult getResult(ReturnCode code, Object object, String msg) {
        return new ManagedResult(code, object, msg);
    }

    public static ManagedResult getResult(ReturnCode code, String msg, String cause) {
        return new ManagedResult(code, msg, cause);
    }

    public static ManagedResult getResult(ReturnCode code, ReturnSubcode subcode, Object object) {
        return new ManagedResult(code, subcode, object);
    }

    public static ManagedResult getResult(ReturnCode code, ReturnSubcode subcode, String msg) {
        return new ManagedResult(code, subcode, msg);
    }

    public static ManagedResult getResult(ReturnCode code, ReturnSubcode subcode, String msg, Exception exception) {
        return new ManagedResult(code, subcode, msg, exception);
    }

    public static ManagedResult getResult(ReturnCode code, ReturnSubcode subcode, Object object, String msg) {
        return new ManagedResult(code, subcode, object, msg);
    }

    public static ManagedResult getResult(ReturnCode code, ReturnSubcode subcode, String msg, String cause) {
        return new ManagedResult(code, subcode, msg, cause);
    }

    public static ManagedResult getResult(ReturnCode code, ReturnSubcode subcode, String msg, String cause, Exception exception) {
        return new ManagedResult(code, subcode, msg, cause, exception);
    }

    public boolean isSuccess() {
        return ReturnCode.SUCCESS == code;
    }

    public boolean nonSuccess() {
        return !isSuccess();
    }

    public boolean nonInterrupted() {
        return !isInterrupted();
    }

    public boolean isExceptioned() {
        return Objects.nonNull(exception);
    }

    public <T> T getObject() {
        return (T) object;
    }

    public ManagedResult(ReturnCode code) {
        this.code = code;
    }

    public ManagedResult(ReturnCode code, String msg) {
        this.code = code;
        this.msg = String.valueOf(msg);
    }

    public ManagedResult(ReturnCode code, Object object) {
        this.code = code;
        this.object = object;
    }

    public ManagedResult(ReturnCode code, Object object, String msg) {
        this.code = code;
        this.object = object;
        this.msg = String.valueOf(msg);
    }

    public ManagedResult(ReturnCode code, String msg, String cause) {
        this.code = code;
        this.msg = String.valueOf(msg);
        this.cause = String.valueOf(cause);
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, Object object) {
        this.code = code;
        this.subcode = subcode;
        this.object = object;
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, String msg) {
        this.code = code;
        this.subcode = subcode;
        this.msg = String.valueOf(msg);
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, String msg, Exception exception) {
        this.code = code;
        this.subcode = subcode;
        this.msg = String.valueOf(msg);
        this.exception = exception;
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, String msg, String cause, Exception exception) {
        this.code = code;
        this.subcode = subcode;
        this.msg = msg;
        this.cause = cause;
        this.exception = exception;
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, Object object, String msg) {
        this.code = code;
        this.subcode = subcode;
        this.object = object;
        this.msg = String.valueOf(msg);
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, String msg, String cause) {
        this.code = code;
        this.subcode = subcode;
        this.msg = String.valueOf(msg);
        this.cause = String.valueOf(cause);
    }

    public ManagedResult(ReturnCode code, boolean interrupted) {
        this.code = code;
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, Object object, boolean interrupted) {
        this.code = code;
        this.object = object;
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, String msg, boolean interrupted) {
        this.code = code;
        this.msg = String.valueOf(msg);
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, Object object, String msg, boolean interrupted) {
        this.code = code;
        this.object = object;
        this.msg = String.valueOf(msg);
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, String msg, String cause, boolean interrupted) {
        this.code = code;
        this.msg = String.valueOf(msg);
        this.cause = String.valueOf(cause);
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, boolean interrupted) {
        this.code = code;
        this.subcode = subcode;
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, Object object, boolean interrupted) {
        this.code = code;
        this.subcode = subcode;
        this.object = object;
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, String msg, boolean interrupted) {
        this.code = code;
        this.subcode = subcode;
        this.msg = String.valueOf(msg);
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, Object object, String msg, boolean interrupted) {
        this.code = code;
        this.subcode = subcode;
        this.object = object;
        this.msg = String.valueOf(msg);
        this.interrupted = interrupted;
    }

    public ManagedResult(ReturnCode code, ReturnSubcode subcode, String msg, String cause, boolean interrupted) {
        this.code = code;
        this.subcode = subcode;
        this.msg = String.valueOf(msg);
        this.cause = String.valueOf(cause);
        this.interrupted = interrupted;
    }
}
