package com.design.infra.context;


import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

import com.google.common.collect.Maps;


@SuppressWarnings("all")
public abstract class BaseContext  {

    private Map<ContextKey, Object> context = Maps.newConcurrentMap();

    public <T> T get(ContextKey key) {
        if (Objects.isNull(key)) {
            return null;
        }
        Object value = context.get(key);
        if (Objects.isNull(value)) {
            return null;
        }
        check(key, value);
        return (T) value;
    }

    public <T> T getIfAbsent(ContextKey key, Supplier<T> supplier) {
        T value = get(key);
        if (Objects.isNull(value) && Objects.nonNull(supplier)) {
            value = supplier.get();
            put(key, value);
        }
        return value;
    }

    public <T> T put(ContextKey key, Object value) {
        if (Objects.isNull(key) || Objects.isNull(value)) {
            return null;
        }
        check(key, value);
        return (T) context.put(key, value);
    }

    public <T> T putIfAbsent(ContextKey key, Object value) {
        if (Objects.isNull(key) || Objects.isNull(value)) {
            return null;
        }
        check(key, value);
        return (T) context.putIfAbsent(key, value);
    }

    public BaseContext putAll(ConcurrentMap<ContextKey, Object> context) {
        if (Objects.isNull(context)) {
            return this;
        }
        this.context.putAll(context);
        return this;
    }

    private void check(ContextKey key, Object value) {
        Objects.requireNonNull(key, "key is null");
        Objects.requireNonNull(value, "value is null");
        if (!key.getClazz().isAssignableFrom(value.getClass())) {
            String errMsg = String.format("incorrect type in context, pealse check. key desc = %s, expected type = [%s], actual type = [%s].", key.getDesc(), key.getClazz(), value.getClass());
            throw new IllegalArgumentException(errMsg);
        }
    }

}
