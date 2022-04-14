package io.github.eeaters.exception;

import org.junit.Test;

import java.io.IOException;


/**
 * @author: eeaters
 */
public class ThrowableSupplierTest {

    @Test(expected = EeatersException.class)
    public void testExecute() {
        ThrowableSupplier.get(() -> execute("hello", true));
    }

    @Test(expected = EeatersException.class)
    public void testExecuteNoResult() {
        ThrowableRunnable.run(() -> execute("hello", true));
    }





    public static String execute(String message, Boolean isError) throws IOException {
        if (isError) {
            throw new IllegalArgumentException("exception occur");
        }
        return "execute: " + message;
    }

}
