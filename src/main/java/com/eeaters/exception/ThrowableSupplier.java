package com.eeaters.exception;

/**
 * @author: eeaters
 */
@FunctionalInterface
public interface ThrowableSupplier<T> {

    T get() throws Throwable;

    static <T> T execute(ThrowableSupplier<T> supplier) {
        try {
            return supplier.get();
        } catch (Throwable throwable) {
            throw new EeatersException(throwable);
        }
    }

    static <T> void executeNoResult(ThrowableSupplier<T> supplier) {
        try {
            supplier.get();
        } catch (Throwable throwable) {
            throw new EeatersException(throwable);
        }
    }

}
