package com.design.infra.function;

/**
 * @author Jiajing Li
 * @date 2020-08-10 16:50:10
 */
@FunctionalInterface
public interface ReturnActionWithEx<T> {

    T execute() throws Exception;

}
