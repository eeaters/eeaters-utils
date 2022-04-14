package io.github.eeaters.exception;

/**
 * @author: eeaters
 */
public class EeatersException extends RuntimeException{

    private static final String DEFAULT_CODE = "999";

    protected String code = DEFAULT_CODE;

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
