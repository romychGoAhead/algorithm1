package org.example.exception;

public class exceptionListsUnequal extends RuntimeException {
    public exceptionListsUnequal() {
    }

    public exceptionListsUnequal(String message) {
        super(message);
    }

    public exceptionListsUnequal(String message, Throwable cause) {
        super(message, cause);
    }

    public exceptionListsUnequal(Throwable cause) {
        super(cause);
    }

    public exceptionListsUnequal(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
