package io.github.eeaters.exception;

/**
 * @author: eeaters
 */
@FunctionalInterface
public interface ThrowableSupplier<T> {

    T get() throws Throwable;

    static <T> T get(ThrowableSupplier<T> supplier) {
        try {
            return supplier.get();
        } catch (Throwable throwable) {
            throw new EeatersException(throwable);
        }
    }

}
