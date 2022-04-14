package io.github.eeaters.exception;

public interface ThrowableConsumer<T> {

    void accept(T t) throws Throwable;

    static <T> void accept(T t, ThrowableConsumer<T> consumer) {
        try {
            consumer.accept(t);
        } catch (Throwable throwable) {
            throw new EeatersException(throwable);
        }
    }
}
