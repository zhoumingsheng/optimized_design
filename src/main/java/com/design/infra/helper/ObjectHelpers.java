package com.design.infra.helper;


import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.design.infra.function.OptionalConsumer;


@SuppressWarnings("all")
public class ObjectHelpers {

    private ObjectHelpers() {}

    public static final Consumer EMPTY_CONSUMER = x -> {};

    public static final Runnable EMPTY_RUNNABLE = () -> {};

    public static final Function IDENTITY_FUNCTION = x -> x;

    public static final Supplier NULL_SUPPLIER = () -> null;

    public static final Predicate ALWAYS_TRUE = x -> true;

    public static final Predicate ALWAYS_FALSE = x -> false;

    public static boolean isNull(Object object) {
        return Objects.isNull(object);
    }

    public static boolean nonNull(Object object) {
        return Objects.nonNull(object);
    }

    public static <T> T requireNonNull(T object) {
        return Objects.requireNonNull(object);
    }

    public static <T> T requireNonNull(T object, String message) {
        return Objects.requireNonNull(object, message);
    }

    public static <T> T requireNonNull(T object, Supplier<String> messageSupplier) {
        return Objects.requireNonNull(object, messageSupplier);
    }

    public static <T> T of(T object, T defaultObject) {
        return Objects.nonNull(object) ? object : defaultObject;
    }

    public static <T> Optional<T> optional(T object, T defaultObject) {
        return Objects.nonNull(object) ? Optional.of(object) : Optional.ofNullable(defaultObject);
    }

    public static <T> Optional<T> optional(T object) {
        return Optional.ofNullable(object);
    }

    public static <T> void peek(T object, Consumer<T> ifPresent, Runnable orElse) {
        OptionalConsumer.of(ifPresent, orElse).accept(optional(object));
    }

    public static <T> void peek(T object, Consumer<T> ifPresent) {
        peek(object, ifPresent, EMPTY_RUNNABLE);
    }

    public static <T> void peek(T object, Runnable orElse) {
        peek(object, EMPTY_CONSUMER, orElse);
    }

    public static <T, R> void peek(T object, Function<T, R> function, Consumer<R> ifPresent, Runnable orElse) {
        OptionalConsumer.of(ifPresent, orElse).accept(optional(object).map(function));
    }

    public static <T, R> void peek(T object, Function<T, R> function, Consumer<R> ifPresent) {
        peek(object, function, ifPresent, EMPTY_RUNNABLE);
    }

    public static <T, R> void peek(T object, Function<T, R> function, Runnable orElse) {
        peek(object, function, EMPTY_CONSUMER, orElse);
    }

    public static <T, R, U> void peek(T object, Function<T, R> function1st, Function<R, U> function2nd, Consumer<U> ifPresent, Runnable orElse) {
        OptionalConsumer.of(ifPresent, orElse).accept(optional(object).map(function1st).map(function2nd));
    }

    public static <T, R, U> void peek(T object, Function<T, R> function1st, Function<R, U> function2nd, Consumer<U> ifPresent) {
        peek(object, function1st, function2nd, ifPresent, EMPTY_RUNNABLE);
    }

    public static <T, R, U> void peek(T object, Function<T, R> function1st, Function<R, U> function2nd, Runnable orElse) {
        peek(object, function1st, function2nd, EMPTY_CONSUMER, orElse);
    }

    public static <T, R, U, X> void peek(T object, Function<T, R> function1st, Function<R, U> function2nd, Function<U, X> function3rd, Consumer<X> ifPresent, Runnable orElse) {
        OptionalConsumer.of(ifPresent, orElse).accept(optional(object).map(function1st).map(function2nd).map(function3rd));
    }

    public static <T, R, U, X> void peek(T object, Function<T, R> function1st, Function<R, U> function2nd, Function<U, X> function3rd, Consumer<X> ifPresent) {
        peek(object, function1st, function2nd, function3rd, ifPresent, EMPTY_RUNNABLE);
    }

    public static <T, R, U, X> void peek(T object, Function<T, R> function1st, Function<R, U> function2nd, Function<U, X> function3rd, Runnable orElse) {
        peek(object, function1st, function2nd, function3rd, EMPTY_CONSUMER, orElse);
    }

    public static <T> void peekWithFilter(T object, Predicate<T> condition, Consumer<T> ifPresent, Runnable orElse) {
        OptionalConsumer.of(ifPresent, orElse).accept(optional(object), condition);
    }

    public static <T> void peekWithFilter(T object, Predicate<T> condition, Consumer<T> ifPresent) {
        peekWithFilter(object, condition, ifPresent, EMPTY_RUNNABLE);
    }

    public static <T> void peekWithFilter(T object, Predicate<T> condition, Runnable orElse) {
        peekWithFilter(object, condition, EMPTY_CONSUMER, orElse);
    }

    public static <T, R> void peekWithFilter(T object, Function<T, R> function, Predicate<R> condition, Consumer<R> ifPresent, Runnable orElse) {
        OptionalConsumer.of(ifPresent, orElse).accept(optional(object).map(function), condition);
    }

    public static <T, R> void peekWithFilter(T object, Function<T, R> function, Predicate<R> condition, Consumer<R> ifPresent) {
        peekWithFilter(object, function, condition, ifPresent, EMPTY_RUNNABLE);
    }

    public static <T, R> void peekWithFilter(T object, Function<T, R> function, Predicate<R> condition, Runnable orElse) {
        peekWithFilter(object, function, condition, EMPTY_CONSUMER, orElse);
    }

    public static <T, R, U> void peekWithFilter(T object, Function<T, R> function1st, Function<R, U> function2nd, Predicate<U> condition, Consumer<U> ifPresent, Runnable orElse) {
        OptionalConsumer.of(ifPresent, orElse).accept(optional(object).map(function1st).map(function2nd), condition);
    }

    public static <T, R, U> void peekWithFilter(T object, Function<T, R> function1st, Function<R, U> function2nd, Predicate<U> condition, Consumer<U> ifPresent) {
        peekWithFilter(object, function1st, function2nd, condition, ifPresent, EMPTY_RUNNABLE);
    }

    public static <T, R, U> void peekWithFilter(T object, Function<T, R> function1st, Function<R, U> function2nd, Predicate<U> condition, Runnable orElse) {
        peekWithFilter(object, function1st, function2nd, condition, EMPTY_CONSUMER, orElse);
    }

    public static <T, R, U, X> void peekWithFilter(T object, Function<T, R> function1st, Function<R, U> function2nd, Function<U, X> function3rd, Predicate<X> condition, Consumer<X> ifPresent, Runnable orElse) {
        OptionalConsumer.of(ifPresent, orElse).accept(optional(object).map(function1st).map(function2nd).map(function3rd), condition);
    }

    public static <T, R, U, X> void peekWithFilter(T object, Function<T, R> function1st, Function<R, U> function2nd, Function<U, X> function3rd, Predicate<X> condition, Consumer<X> ifPresent) {
        peekWithFilter(object, function1st, function2nd, function3rd, condition, ifPresent, EMPTY_RUNNABLE);
    }

    public static <T, R, U, X> void peekWithFilter(T object, Function<T, R> function1st, Function<R, U> function2nd, Function<U, X> function3rd, Predicate<X> condition, Runnable orElse) {
        peekWithFilter(object, function1st, function2nd, function3rd, condition, EMPTY_CONSUMER, orElse);
    }

    public static <T, R> R map(T object, Function<T, R> mapper, Supplier<R> other) {
        return optional(object).map(mapper).orElseGet(other);
    }

    public static <T, R> R map(T object, Function<T, R> mapper) {
        return (R) map(object, mapper, NULL_SUPPLIER);
    }

    public static <T, R> R map(T object, Supplier<R> other) {
        return (R) map(object, IDENTITY_FUNCTION, other);
    }

    public static <T, R, U> U map(T object, Function<T, R> mapper1st, Function<R, U> mapper2nd, Supplier<U> other) {
        return optional(object).map(mapper1st).map(mapper2nd).orElseGet(other);
    }

    public static <T, R, U> U map(T object, Function<T, R> mapper1st, Function<R, U> mapper2nd) {
        return (U) map(object, mapper1st, mapper2nd, NULL_SUPPLIER);
    }

    public static <T, R, U, X> X map(T object, Function<T, R> mapper1st, Function<R, U> mapper2nd, Function<U, X> mapper3rd, Supplier<X> other) {
        return optional(object).map(mapper1st).map(mapper2nd).map(mapper3rd).orElseGet(other);
    }

    public static <T, R, U, X> X map(T object, Function<T, R> mapper1st, Function<R, U> mapper2nd, Function<U, X> mapper3rd) {
        return (X) map(object, mapper1st, mapper2nd, mapper3rd, NULL_SUPPLIER);
    }

    public static <T, R> R mapWithFilter(T object, Predicate<T> condition, Function<T, R> mapper, Supplier<R> other) {
        return optional(object).filter(condition).map(mapper).orElseGet(other);
    }

    public static <T, R> R mapWithFilter(T object, Predicate<T> condition, Function<T, R> mapper) {
        return (R) mapWithFilter(object, condition, mapper, NULL_SUPPLIER);
    }

    public static <T, R> R mapWithFilter(T object, Predicate<T> condition, Supplier<R> other) {
        return (R) mapWithFilter(object, condition, IDENTITY_FUNCTION, other);
    }

    public static <T, R, U> U mapWithFilter(T object, Predicate<T> condition, Function<T, R> mapper1st, Function<R, U> mapper2nd, Supplier<U> other) {
        return optional(object).filter(condition).map(mapper1st).map(mapper2nd).orElseGet(other);
    }

    public static <T, R, U> U mapWithFilter(T object, Predicate<T> condition, Function<T, R> mapper1st, Function<R, U> mapper2nd) {
        return (U) mapWithFilter(object, condition, mapper1st, mapper2nd, NULL_SUPPLIER);
    }

    public static <T, R, U, X> X mapWithFilter(T object, Predicate<T> condition, Function<T, R> mapper1st, Function<R, U> mapper2nd, Function<U, X> mapper3rd, Supplier<X> other) {
        return optional(object).filter(condition).map(mapper1st).map(mapper2nd).map(mapper3rd).orElseGet(other);
    }

    public static <T, R, U, X> X mapWithFilter(T object, Predicate<T> condition, Function<T, R> mapper1st, Function<R, U> mapper2nd, Function<U, X> mapper3rd) {
        return (X) mapWithFilter(object, condition, mapper1st, mapper2nd, mapper3rd, NULL_SUPPLIER);
    }

    public static <T> T identity(T object, Function<T, T> mapper) {
        return map(object, mapper, () -> object);
    }

    public static <T> T identityWithFilter(T object, Predicate<T> condition, Function<T, T> mapper) {
        return mapWithFilter(object, condition, mapper, () -> object);
    }

    public static <T> boolean filter(T object) {
        return optional(object).isPresent();
    }

    public static <T> boolean filter(T object, Predicate<T> condition) {
        return optional(object).filter(condition).isPresent();
    }

    public static <T> boolean filter(T object, Predicate<T> condition1st, Predicate<T> condition2nd) {
        return optional(object).filter(condition1st).filter(condition2nd).isPresent();
    }

    public static <T> boolean filter(T object, Predicate<T> condition1st, Predicate<T> condition2nd, Predicate<T> condition3rd) {
        return optional(object).filter(condition1st).filter(condition2nd).filter(condition3rd).isPresent();
    }

    public static <T> boolean filter(T object, Supplier<Boolean> other) {
        return map(object, x -> filter(x), other);
    }

    public static <T> boolean filter(T object, Predicate<T> condition, Supplier<Boolean> other) {
        return map(object, x -> filter(x, condition), other);
    }

    public static <T> boolean filter(T object, Predicate<T> condition1st, Predicate<T> condition2nd, Supplier<Boolean> other) {
        return map(object, x -> filter(x, condition1st, condition2nd), other);
    }

    public static <T> boolean filter(T object, Predicate<T> condition1st, Predicate<T> condition2nd, Predicate<T> condition3rd, Supplier<Boolean> other) {
        return map(object, x -> filter(x, condition1st, condition2nd, condition3rd), other);
    }

    public static <T> T supply(Supplier<T> supplier) {
        return map(supplier, x -> x.get());
    }



}
