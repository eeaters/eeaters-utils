package com.eeaters.exception;

import org.junit.Test;

import java.io.IOException;


/**
 * @author: eeaters
 */
public class ThrowableSupplierTest {

    @Test(expected = EeatersException.class)
    public void testExecute() {
        ThrowableSupplier.execute(() -> execute("hello", true));
    }

    @Test(expected = EeatersException.class)
    public void testExecuteNoResult() {
        ThrowableSupplier.executeNoResult(() -> execute("hello", true));
    }





    public static String execute(String message, Boolean isError) throws IOException {
        if (isError) {
            throw new IllegalArgumentException("exception occur");
        }
        return "execute: " + message;
    }

}
