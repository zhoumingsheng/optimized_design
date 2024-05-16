package com.design.infra.function;



@FunctionalInterface
public interface ReturnActionWithEx<T> {

    T execute() throws Exception;

}
