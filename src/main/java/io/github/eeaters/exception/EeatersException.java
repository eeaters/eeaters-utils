package io.github.eeaters.exception;

/**
 * @author: eeaters
 */
public class EeatersException extends RuntimeException{

    protected String code;

    public EeatersException(String message, String code) {
        super(message);
        this.code = code;
    }

    public EeatersException(Throwable throwable) {
        super(throwable);
    }

    public String getCode() {
        return code;
    }
}
