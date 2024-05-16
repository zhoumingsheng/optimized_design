package com.design.infra.function;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;


@SuppressWarnings("all")
public class OptionalConsumer<T> implements Consumer<Optional<T>> {

    private final Consumer<T> consumer;

    private final Runnable runnable;

    public OptionalConsumer(Consumer<T> consumer, Runnable runnable) {
        super();
        this.consumer = consumer;
        this.runnable = runnable;
    }

    public static <T> OptionalConsumer<T> of(Consumer<T> consumer, Runnable runnable) {
        return new OptionalConsumer<>(consumer, runnable);
    }

    @Override
    public void accept(Optional<T> optional) {
        if (optional.isPresent()) {
            consumer.accept(optional.get());
        } else {
            runnable.run();
        }
    }

    public void accept(Optional<T> optional, Predicate<T> predicate) {
        if (optional.isPresent() && predicate.test(optional.get())) {
            consumer.accept(optional.get());
        } else {
            runnable.run();
        }
    }

}
