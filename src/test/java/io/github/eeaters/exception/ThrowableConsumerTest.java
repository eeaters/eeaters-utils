package io.github.eeaters.exception;

import org.junit.Test;

public class ThrowableConsumerTest {

    @Test
    public void test() {
        Echo echo = new Echo();
        ThrowableConsumer.accept("你好", str -> echo.echo(str));
    }


    public class Echo{
        void echo(String message) throws Exception {
            System.out.println(message);
        }
    }
}
