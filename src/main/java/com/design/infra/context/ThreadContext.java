package com.design.infra.context;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;


@SuppressWarnings("all")
public final class ThreadContext {

    private ThreadContext() {}

    private static ThreadLocal<Map<ContextKey, Object>> context = ThreadLocal.withInitial(Maps::newConcurrentMap);

    public static <T> T get(ContextKey key) {
        if (Objects.isNull(key)) {
            return null;
        }
        Object value = getContext().get(key);
        if (Objects.isNull(value)) {
            return null;
        }
        check(key, value);
        return (T) value;
    }

    public static <T> T getIfAbsent(ContextKey key, Supplier<T> supplier) {
        T value = get(key);
        if (Objects.isNull(value) && Objects.nonNull(supplier)) {
            value = supplier.get();
            put(key, value);
        }
        return value;
    }

    public static <T> T put(ContextKey key, Object value) {
        if (Objects.isNull(key) || Objects.isNull(value)) {
            return null;
        }
        check(key, value);
        return (T) getContext().put(key, value);
    }

    public <T> T putIfAbsent(ContextKey key, Object value) {
        if (Objects.isNull(key) || Objects.isNull(value)) {
            return null;
        }
        check(key, value);
        return (T) getContext().putIfAbsent(key, value);
    }

    public static void putAll(ConcurrentMap<ContextKey, Object> context) {
        if (Objects.isNull(context)) {
            return;
        }
        getContext().putAll(context);
    }

    public static void clear() {
        context.remove();
    }

    private static void check(ContextKey key, Object value) {
        Objects.requireNonNull(key, "key is null");
        Objects.requireNonNull(value, "value is null");
        if (!key.getClazz().isAssignableFrom(value.getClass())) {
            String errMsg = String.format("incorrect type in context, pealse check. key desc = %s, expected type = [%s], actual type = [%s].", key.getDesc(), key.getClazz(), value.getClass());
            throw new IllegalArgumentException(errMsg);
        }
    }

    private static Map<ContextKey, Object> getContext() {
        return context.get();
    }

}
