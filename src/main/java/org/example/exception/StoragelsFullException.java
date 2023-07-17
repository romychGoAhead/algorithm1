package org.example.exception;

public class StoragelsFullException extends RuntimeException { //исключение если элемент выходит за
    // пределы фактического количества элементов


    public StoragelsFullException() {
    }

    public StoragelsFullException(String message) {
        super(message);
    }

    public StoragelsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public StoragelsFullException(Throwable cause) {
        super(cause);
    }

    public StoragelsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
