package org.example.exception;

public class IndexFullException extends RuntimeException { //исключение, если индекс больше фактического
    // количества элементов

    public IndexFullException() {
    }

    public IndexFullException(String message) {
        super(message);
    }

    public IndexFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexFullException(Throwable cause) {
        super(cause);
    }

    public IndexFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
