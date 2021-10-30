package io.github.eeaters.exception;

/**
 * @author: eeaters
 */
@FunctionalInterface
public interface ThrowableRunnable {

    void run() throws Throwable;

    static void execute(ThrowableRunnable runnable) {
        try {
            runnable.run();
        } catch (Throwable throwable) {
            throw new EeatersException(throwable);
        }
    }

}
